package recursion;

public class minPoints {
    public static void main(String[] args) {
        int [][]mat = {{-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000,-1000},
                        {-1000,-1000,-1000,-1000,-1,-1000,-1000,-1000,-1000,-1000},
        };
        int[][] mat1 = {{-1000, -1000, -1000, -1000, 10},
                {-1000, -1000, -1000, -1000, -1000},
                {-1000, -1000, -1000, -1000, -1000},
                {-1000, -1000, -1000, -1000, -1000},
                {-1000, -1000, -1000, -1000, -1000},
        };
                System.out.println(minPoints(mat1));
    }
    public static int minPoints( int [][]m) {
        return findLowestBinSearch(m,1,Integer.MAX_VALUE);
        //return findLowestNumLinear(m,1);
    }
    public static int findLowestNumLinear(int [][]m,int i) {
        if(minPoints(m,0,0,i)) {
            return i;
        }
        return findLowestNumLinear(m,i+1);
    }
    public static int findLowestBinSearch(int [][]m,int low,int high) {
        int middle = low + (high -low ) /2;
        if(low > high) {
            return Integer.MAX_VALUE;
        }
        if(minPoints(m,0,0,middle)) {
            return Math.min(middle,findLowestBinSearch(m,low,middle-1));
        }
        return findLowestBinSearch(m,middle+1,high);
    }
    public static boolean minPoints(int [][]m, int i,int j,int sum) {
        if(i == m.length || j==m[i].length || sum <=0) {
            return false;
        }
        if(i==m.length-1 && j==m[i].length-1) {
            if(sum+m[i][j] >0) {
                return true;
            }
        }
        return minPoints(m,i+1,j,sum+m[i][j]) || minPoints(m,i,j+1,sum+m[i][j]);
    }
}

