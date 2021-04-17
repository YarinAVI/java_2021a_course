package recursion;

public class howManyPaths {
    public static void main(String[] args) {
        int mat[][] = {{1,3,1,6},{2,8,1,2},{6,2,7,5},{2,4,1,3}};
        System.out.println(howManyPaths(mat));
    }
    public static int howManyPaths(int [][]mat) {
       return howManyPaths(mat,0,0);
    }
    public static int howManyPaths(int [][]mat,int i,int j) {
        if(i>=mat.length || i<0 || j<0 || j>=mat[i].length || mat[i][j] <0) {
            return 0;
        }
        if(i==mat.length-1 && j == mat[i].length-1) {
            return 1;
        }

        int k= mat[i][j];
        mat[i][j] = -1;
        int res = howManyPaths(mat,i+k,j) + howManyPaths(mat,i-k,j) + howManyPaths(mat,i,j+k) + howManyPaths(mat,i,j-k);
        mat[i][j] = k;
        return res;
    }
}
