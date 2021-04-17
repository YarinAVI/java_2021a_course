package recursion;

public class findSum {
    public static void main(String[] args) {
        int mat[][] = { {2, 41, 3, 14},
                        {2, 1, 24, 7,},
                        {2, 15, 10, 54},
                        {63, 22, 2, 4}};
        int[][] path = new int[mat.length][mat[0].length];

        System.out.println(findSum(mat,4,path));


        for(int i=0;i<path.length;i++) {
            for(int j=0;j<path[i].length;j++) {
                System.out.print(path[i][j]+",");
            }
            System.out.println();
        }

    }
   static boolean findSum ( int mat[][], int sum, int[][] path){
        return iterateRows(mat,sum,0,path);
    }

    static boolean iterateRows(int mat[][],int sum,int i,int[][] path) {
       boolean res =  iterateColumns(mat,sum,i,0,path);
        if(i+1 < mat.length) {
            return res | iterateRows(mat,sum,i+1,path);
        }
        return res;
    }
    static boolean iterateColumns(int mat[][],int sum,int i,int j,int [][]path) {
        boolean res = findSum(mat,sum,path,i,j);
        if(j+1 < mat[i].length) {
            return res | iterateColumns(mat,sum,i,j+1,path);
        }
        return res;
    }
    static boolean findSum(int mat[][],int sum,int [][]path, int i,int j) {
        if(i< 0 || j <0 || i== mat.length || j ==mat[i].length || sum <0 || mat[i][j] < 0) {
            return false;
        }
        if(sum==0) {
            return true;
        }
        int temp = mat[i][j];
        mat[i][j] = -1;
        path[i][j] = 1;
        boolean a = false,b = false, c=false,d = false;
        a = findSum(mat,sum-temp,path,i+1,j);
        b = findSum(mat,sum-temp,path,i-1,j);
        c = findSum(mat,sum-temp,path,i,j+1);
        d = findSum(mat,sum-temp,path,i,j-1);
        mat[i][j] = temp;
        if(!a && !b && !c && !d) {
            path[i][j] = 0;
        }
        return a || b || c || d;
    }
}
