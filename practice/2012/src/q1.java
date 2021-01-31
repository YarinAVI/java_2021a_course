public class q1 {
    public static void main(String[] args) {
        int mat[][] = {{8,4,2,4,3},
                {6,3,8,4,5},
                {1,4,9,9,7},
                {2,1,7,6,5}};
        int [][] mat1 =
                {
                        { 1, 2, 3},
                        { 4, 5, 6},
                        { 7, 8, 9},

                };
       // printPathWeights(mat);
        printPathWeights(mat1,0,0,0);
        System.out.println("============================================");
        printPathWeights(mat1);
    }
    public static void printPathWeights(int [][]m) {
        printPathWeights(m,0,0,"",0);
    }
    public static void printPathWeights(int [][]m, int i,int j,String path,int sum) {
        if(i==m.length-1 && j ==m[i].length-1) {
            System.out.println(path+m[i][j]+"="+(sum+m[i][j]));
            return;
        }
        int b = m[i][j];
        m[i][j] = -1;
        if((i+1) < m.length && m[i+1][j]!=-1) printPathWeights(m,i+1,j,path+b+"+",sum+b);
        if((i-1) >=0 && m[i-1][j]!=-1) printPathWeights(m,i-1,j,path+b+"+",sum+b);
        if((j+1) < m[i].length && m[i][j+1]!=-1) printPathWeights(m,i,j+1,path+b+"+",sum+b);
        if((j-1) >=0 && m[i][j-1]!=-1) printPathWeights(m,i,j-1,path+b+"+",sum+b);
        m[i][j] = b;
    }
    private static void printPathWeights(int [][]m, int row, int col, int sum)
    {
        if (row == m.length - 1 && col == m[0].length - 1)
        {
            sum += m[row][col];
            System.out.println(m[row][col]+" = "+sum);
            return;
        }
        sum += m[row][col];

        int temp = m[row][col];
        m[row][col] = -1;
        if(col+1 < m[0].length && m[row][col+1]!=-1) {
            System.out.print(temp+"+");
            printPathWeights(m, row, col + 1, sum);
        }
        if(col-1 >= 0 && m[row][col-1]!=-1) {
            System.out.print(temp+"+");
            printPathWeights(m, row, col - 1, sum);
        }
        if(row+1 < m.length && m[row+1][col]!=-1) {
            System.out.print(temp + "+");
            printPathWeights(m, row + 1, col, sum);
        }
        if(row-1 >=0 && m[row-1][col]!=-1) {
            System.out.print(temp + "+");
            printPathWeights(m, row - 1, col, sum);
        }
        m[row][col] = temp;
        return;
    }
}
