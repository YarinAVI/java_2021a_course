public class shortest_path_2015a2 {
    public static void main(String[] args) {
        int test[][] = {{3,13,15,28,30},
                        {40,51,52,29,30},
                        {28,10,53,54,53},
                        {53,12,55,53,60},
                        {70,62,56,20,80},
                        {80,81,90,95,100}};
        System.out.println(shortestPath(test));
    }
    public static int shortestPath( int [][]mat) {
        return shortestPath(mat,0,0,1);
    }
    public static int shortestPath(int [][]mat,int i,int j,int steps) {
        if (i == mat.length - 1 && j == mat[i].length - 1) {
            return steps;
        }
        mat[i][j] = -mat[i][j];
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE, d = Integer.MAX_VALUE;
        if ((i + 1) < mat.length && mat[i + 1][j] >= 0 && mat[i + 1][j] > (-mat[i][j])) {
            a = shortestPath(mat, i + 1, j, steps + 1);
        }
        if ((i - 1) >= 0 && mat[i - 1][j] >= 0 && mat[i - 1][j] > (-mat[i][j])) {
            b = shortestPath(mat, i - 1, j, steps + 1);
        }
        if ((j + 1) < mat[i].length && mat[i][j + 1] >= 0 && mat[i][j + 1] > (-mat[i][j])){
            c = shortestPath(mat, i, j + 1, steps + 1);
        }
        if ((j - 1) >=0 && mat[i][j-1] >= 0 && mat[i][j-1] > (-mat[i][j])) {
            d = shortestPath(mat, i, j - 1, steps + 1);
        }
        mat[i][j] = -mat[i][j];
        return Math.min(Math.min(a,b),Math.min(c,d));
    }
}
