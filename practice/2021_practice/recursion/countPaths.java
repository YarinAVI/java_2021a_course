package recursion;

public class countPaths {
    public static void main(String[] args) {
        int mat[][] = {{12,22,23,54},{43,35,21,20},{34,21,43,21},{25,30,0,20},{0,22,10,10},{20,13,3,45}};
        System.out.println(countPaths(mat));
    }
    public static int countPaths(int [][]mat){
        return countPaths(mat,0,0);
    }
    public static int countPaths(int [][]mat,int i,int j) {
        if(i >= mat.length || j>=mat[0].length) {
            return 0;
        }
        if(i == mat.length-1 && j == mat[0].length-1) {
            return 1;
        }
        return countPaths(mat,i+mat[i][j]%10,j+((mat[i][j]/10)%10)) + countPaths(mat,i+((mat[i][j]/10)%10),j+mat[i][j]%10);
    }
}
