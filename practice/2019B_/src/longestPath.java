public class longestPath {
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1,1,1,1},{1,1,0,1,0,0,1},{1,1,1,1,0,1,1}};
        System.out.println(longestPath(mat,2,5));
    }
    public static int longestPath(int mat[][],int x,int y) {
        return longestPath(mat,x,y,0,0,0);
    }
    public static int longestPath(int mat[][],int x,int y,int i,int j,int distance) {
        if(i==x && j==y) {
            return distance+1;
        }
        mat[i][j] = 0;
        int op1=-1,op2=-1,op3=-1,op4=-1;
        if((i+1)<mat.length && mat[i+1][j]==1) {
            op1=longestPath(mat,x,y,i+1,j,distance+1);
        }
        if((i-1)>=0 && mat[i-1][j]==1) {
            op2=longestPath(mat,x,y,i-1,j,distance+1);
        }
        if((j+1)<mat[i].length && mat[i][j+1]==1) {
            op3=longestPath(mat,x,y,i,j+1,distance+1);
        }
        if((j-1)>=0 && mat[i][j-1]==1) {
            op4=longestPath(mat,x,y,i,j-1,distance+1);
        }
        mat[i][j]=1;
        return Math.max(Math.max(op1,op2),Math.max(op3,op4));
    }
}
