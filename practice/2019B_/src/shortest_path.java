public class shortest_path {
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1,1,1,1},{1,1,0,1,0,0,1},{1,1,1,1,0,1,1}};
        System.out.println(shortestPath(mat,2,5));
    }
    public static int shortestPath(int mat[][],int x,int y) {
        return shortestPath(mat,x,y,0,0,0);
    }
    public static int shortestPath(int mat[][],int x,int y,int i,int j,int distance) {
        if(i==x && j==y) {
            return distance+1;
        }
        mat[i][j] = 0;
        int op1=Integer.MAX_VALUE,op2=Integer.MAX_VALUE,op3=Integer.MAX_VALUE,op4=Integer.MAX_VALUE;
        if((i+1)<mat.length && mat[i+1][j]==1) {
            op1=shortestPath(mat,x,y,i+1,j,distance+1);
        }
        if((i-1)>=0 && mat[i-1][j]==1) {
            op2=shortestPath(mat,x,y,i-1,j,distance+1);
        }
        if((j+1)<mat[i].length && mat[i][j+1]==1) {
            op3=shortestPath(mat,x,y,i,j+1,distance+1);
        }
        if((j-1)>=0 && mat[i][j-1]==1) {
            op4=shortestPath(mat,x,y,i,j-1,distance+1);
        }
        mat[i][j]=1;
        return Math.min(Math.min(op1,op2),Math.min(op3,op4));
    }
}
