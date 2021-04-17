package Complexity_questions;

public class isSink {
    public static void main(String[] args) {
        int mat[][] = {{0,1,0,1,1,0},
                       {1,0,1,1,0,0},
                       {0,0,0,1,0,1},
                       {1,0,0,0,0,0},
                       {0,1,0,1,1,1}};
        System.out.println(isSink(mat));
    }
    public static int isSink (int [][] mat)
    {
        int row = 0, col = 0 , sum = 0 ,sum1=0; ;
        while(row < mat.length && col <mat.length) // The time complexity is n - on the worst case its run only on he length.
        {
            if(mat [row][col] == 0)
                col++;
            else
                row++;
        }// end of while loop
        if(row == mat.length)
            return -1;
        else
            col=row;
        for(int i = 0;i<mat.length;i++){ // The time complexity is 2n - on the worst case its run only on he length.
            sum+=mat[row][i];
            sum1+=mat[i][col];
        }
        if(sum1!=mat.length-1 ||sum!=0 )
            return -1;
        else
            return row;
    }
}
