package recursion;

public class test {
    public static int maxSumKnight(int[][] mat)
    {
        return maxSumKnight(mat,0,0,0);
    }
    public static int maxSumKnight(int[][] mat,int i,int j, int sum)
    {

        if(i<0||i>=mat.length||j<0||j>=mat[0].length || mat[i][j] <0)
        {
            return -1;
        }
        if(i==mat.length-1&&j==mat[0].length-1)
        {
            return sum+mat[i][j];
        }
        int cur = mat[i][j];
        mat[i][j] = -1;
        int a = maxSumKnight(mat,i+2,j-1,sum+cur);
        int b = maxSumKnight(mat,i+2,j+1,sum+cur);
        int c = maxSumKnight(mat,i+1,j+2,sum+cur);
        int d = maxSumKnight(mat,i+1,j-2,sum+cur);
        int e = maxSumKnight(mat,i-1,j-2,sum+cur);
        int f = maxSumKnight(mat,i-1,j+2,sum+cur);
        int g = maxSumKnight(mat,i-2,j+1,sum+cur);
        int k = maxSumKnight(mat,i-2,j+1,sum+cur);
        return Math.max(Math.max(Math.max(a,b),Math.max(c,d)),Math.max(Math.max(e,f),Math.max(g,k)));
    }
    public static void main(String[] args)
    {
        // System.out.println(ways(4,2));
        int [][]mat = {{4,5,6,7,1},
                        {3,5,1,7,4},
                        {4,5,6,5,8},
                        {3,4,7,7,9},
                        {6,2,2,7,6}};
        System.out.println(maxSumKnight(mat));
    }
}
