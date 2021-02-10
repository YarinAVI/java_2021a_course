public class TotalWays_2020_87 {
    public static void main(String[] args) {
        int test[][] = new int[3][3];
        System.out.println(totalWays(test,3));
    }
    public static int totalWays(int [][] mat,int k){
        return totalWays(mat,k,0,true,0,1,"(0,0)") + totalWays(mat,k,0,false,1,0,"(0,0)");
    }
    public static int totalWays(int [][]mat,int k,int TurnsCounter,Boolean Right,int i,int j,String path) {
        if(i==mat.length || j==mat[i].length) {
            return 0;
        }
        else if(i == mat.length-1 && j == mat[i].length-1) {
            if(TurnsCounter == k) {
                System.out.println(path+"("+i+","+j+")");
                return 1;
            }
            return 0;
        }
        if(Right) {
            return totalWays(mat,k,TurnsCounter,true,i,j+1,path+"("+i+","+j+")") + totalWays(mat,k,TurnsCounter+1,false,i+1,j,path+"("+i+","+j+")");
        }
        return totalWays(mat,k,TurnsCounter+1,true,i,j+1,path+"("+i+","+j+")") + totalWays(mat,k,TurnsCounter,false,i+1,j,path+"("+i+","+j+")");
    }
}
