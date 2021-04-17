package recursion;

public class maxSumKnight {
    public static void main(String[] args) {
        int [][]mat = {{4,5,6,7,1},{3,5,1,7,4},{4,5,6,5,8},{3,4,7,7,9},{6,2,2,7,6}};
        System.out.println(maxSumKnight(mat));
    }
    public static int maxSumKnight(int [][]mat) {
        return maxSumKnight(mat,0,0,0);
    }
    public static int iterateRows(int [][]mat,int i) {
        int res = iterateColumns(mat,i,0);
        if(i+1 < mat.length) {
            return Math.max(iterateRows(mat,i+1),res);
        }
        return res;
    }
    public static int iterateColumns(int [][]mat,int i,int j) {
        int res = maxSumKnight(mat,i,j,0);
        if(j+1 < mat[i].length) {
            return Math.max(iterateColumns(mat,i,j+1),res);
        }
        return res;
    }
    public static int maxSumKnight(int [][]mat,int i,int j,int sum) {

        if(i==mat.length-1 && j==mat[i].length-1) {
            return sum + mat[i][j];
        }
        mat[i][j] = -mat[i][j];
        int op1 = 0, op2= 0, op3 =0, op4=0, op5=0,op6=0,op7=0,op8=0;
        if((i+2) <mat.length && j+1 <mat[i].length && mat[i+2][j+1]>0 && Math.abs(mat[i+2][j+1] - (-mat[i][j]))<=1) {
            op1 = maxSumKnight(mat, i + 2, j + 1, sum + (-mat[i][j]));
        }
        if((i+2) <mat.length && j-1 >=0 && mat[i+2][j-1]>0 && Math.abs(mat[i+2][j-1] - (-mat[i][j]))<=1) {
            op2 = maxSumKnight(mat, i + 2, j - 1, sum + (-mat[i][j]));
        }
        if((i-2) >=0 && j+1 <mat[i].length && mat[i-2][j+1]>0 && Math.abs(mat[i-2][j+1] - (-mat[i][j]))<=1) {
            op3 = maxSumKnight(mat, i - 2, j + 1, sum + (-mat[i][j]));
        }
        if((i-2) >=0 && j-1 >=0 && mat[i-2][j-1]>0 && Math.abs(mat[i-2][j-1] - (-mat[i][j]))<=1) {
            op4 = maxSumKnight(mat, i - 2, j - 1, sum + (-mat[i][j]));
        }
        if((i+1) <mat.length && j+2 <mat[i].length && mat[i+1][j+2]>0 && Math.abs(mat[i+1][j+2] - (-mat[i][j]))<=1) {
            op5 = maxSumKnight(mat, i + 1, j + 2, sum + (-mat[i][j]));
        }
        if((i+1) <mat.length && j-2 >=0 && mat[i+1][j-2]>0 && Math.abs(mat[i+1][j-2] - (-mat[i][j]))<=1) {
            op6 = maxSumKnight(mat, i + 1, j - 2, sum + (-mat[i][j]));
        }
        if((i-1) >=0 && j+2 <mat[i].length && mat[i-1][j+2]>0 && Math.abs(mat[i-1][j+2] - (-mat[i][j]))<=1) {
            op7 = maxSumKnight(mat, i - 1, j + 2, sum + (-mat[i][j]));
        }
        if((i-1) >=0 && j-2 >=0 && mat[i-1][j-2]>0 && Math.abs(mat[i-1][j-2] - (-mat[i][j]))<=1) {
            op8 = maxSumKnight(mat, i - 1, j - 2, sum + (-mat[i][j]));
        }
        mat[i][j] = -mat[i][j];
        return Math.max(Math.max(Math.max(op1,op2),Math.max(op3,op4)),Math.max(Math.max(op5,op6),Math.max(op7,op8)));
    }
}
