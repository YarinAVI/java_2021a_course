public class q1 {
    public static void main(String[] args) {
        int mat[][] = {{8,4,2,4,3},
                {6,3,8,4,5},
                {1,4,9,9,7},
                {2,1,7,6,5}};

        printPathWeights(mat);
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

}
