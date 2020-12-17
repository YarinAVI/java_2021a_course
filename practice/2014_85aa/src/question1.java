public class question1 {
    public static void main(String[] args) {
        int mat[][] = {{3,8,7,1},{5,15,2,4},{12,14,-13,22},{13,16,17,52}};
        printPath(mat);
    }
    public static void printPath(int[][]mat) {
        printPath(mat,"",0,0);
    }
    public static void printPath(int [][]mat,String path,int i,int j) {
        int backup = mat[i][j];

        if(check(mat,i,j)) {
            System.out.println(path+"("+i+","+j+")");
            return;
        }
        mat[i][j] = Integer.MIN_VALUE;
        if((i+1) < mat.length && mat[i+1][j]>backup) {
            printPath(mat,path+"("+i+","+j+")",i+1,j);
        }
        if((i-1) >=0 && mat[i-1][j]>backup) {
            printPath(mat,path+"("+i+","+j+")",i-1,j);
        }
        if((j+1) < mat[i].length && mat[i][j+1]>backup) {
            printPath(mat,path+"("+i+","+j+")",i,j+1);
        }
        if((j-1)>=0 && mat[i][j-1] > backup) {
            printPath(mat,path+"("+i+","+j+")",i,j-1);
        }
        mat[i][j] = backup;
    }
    public static boolean check(int [][]mat,int i,int j) {
        boolean res = true;
        if((i+1)<mat.length) {
            res &= mat[i][j]>mat[i+1][j];
        }
        if((i-1) >=0) {
            res &= mat[i][j] > mat[i-1][j];
        }
        if((j+1) < mat[i].length) {
            res &= mat[i][j]> mat[i][j+1];
        }
        if((j-1) >=0) {
            res &= mat[i][j]>mat[i][j-1];
        }
        return res;
    }
}
