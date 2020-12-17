public class q1 {
    public static void main(String[] args) {
        int mat[][] = {{8,9,5,1,7,8},{9,5,5,16,17,18},{10,11,6,15,2,19},{7,12,13,14,4,20},{9,13,4,15,22,21},{10,11,12,12,23,22}};
        System.out.println(isPath(mat));
    }
    public static boolean isPath(int [][]mat) {
        return isPath(mat,0,0,"");
    }
    public static boolean isPath(int [][]mat,int i,int j,String path){
        if(i==mat.length-1 && j==mat[i].length-1) {
            System.out.println(path+mat[i][j]);
            return true;
        }
        mat[i][j]++;
        boolean result = false;
        if((i+1)< mat.length && mat[i][j]-1 < mat[i+1][j]) {
            result |= isPath(mat,i+1,j,path+(mat[i][j]-1)+"->");
        }
        if((i-1)>=0 && mat[i][j]-1 < mat[i-1][j]) {
            result |= isPath(mat,i-1,j,path+(mat[i][j]-1)+"->");
        }
        if((j+1) < mat[i].length && mat[i][j]-1 < mat[i][j+1]) {
            result |=isPath(mat,i,j+1,path+(mat[i][j]-1)+"->");
        }
        if((j-1)>=0 && mat[i][j]-1 < mat[i][j-1]) {
            result |=isPath(mat,i,j-1,path+(mat[i][j]-1)+"->");
        }
        mat[i][j]--;
        return result;
    }
}
