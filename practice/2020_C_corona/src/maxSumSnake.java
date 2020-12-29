public class maxSumSnake {
    public static void main(String[] args) {
        int mat[][] = {{4,5,6,7,1},{3,5,1,7,4},{1,5,6,7,8},{3,4,5,7,9},{3,2,2,7,6}};
        System.out.println(maxSumSnake(mat));
    }
    public static int maxSumSnake(int [][]mat) {
        return maxSumSnake(mat,0,0,0);
    }
    public static int maxSumSnake(int mat[][],int i,int j,int sum) {
        if(i == mat.length-1 && j == mat[i].length-1) {
            return sum + mat[i][j];
        }
        int backup = mat[i][j];
        mat[i][j] =-1;
        int op1=0,op2=0,op3=0,op4=0;
        if((i+1)<mat.length && Math.abs(backup-mat[i+1][j]) <=1 && mat[i+1][j]!=-1) {
            op1 = maxSumSnake(mat,i+1,j,sum+backup);
        }
        if((i-1)>=0 && Math.abs(backup-mat[i-1][j]) <=1 && mat[i-1][j]!=-1) {
            op2 = maxSumSnake(mat,i-1,j,sum+backup);
        }
        if((j+1)<mat[i].length && Math.abs(backup-mat[i][j+1]) <=1 && mat[i][j+1]!=-1) {
            op3 = maxSumSnake(mat,i,j+1,sum+backup);
        }
        if((j-1)>=0 && Math.abs(backup-mat[i][j-1]) <=1 && mat[i][j-1]!=-1) {
            op4 = maxSumSnake(mat,i,j-1,sum+backup);
        }
        mat[i][j] = backup;
        return Math.max(Math.max(op1,op2),Math.max(op3,op4));
    }
}
