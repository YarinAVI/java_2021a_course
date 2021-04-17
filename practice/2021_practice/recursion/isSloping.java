package recursion;

public class isSloping {
    public static void main(String[] args) {
        int a[][] = {{0,7,5,9,3}
                    ,{-1,0,4,7,6}
                    ,{-3,-2,0,2,3}
                    ,{-7,-9,-2,0,4}
                    ,{-1,-8,-5,-8,0}};
        System.out.println(isSloping(a));
    }
    public static boolean isSloping(int [][]a) {
        return isSloping(a,0,0);
    }
    public static boolean isSloping(int [][]a,int i,int j) {
        boolean res = false;
        if(a[i][j] !=0) {
            return false;
        }
        res = CheckAbove(a,i-1,j) && CheckBelow(a,i+1,j);
        if(i+1 < a.length && j+1 < a[i].length) {
            return res && isSloping(a,i+1,j+1);
        }
        return res;
    }
    public static boolean CheckAbove(int [][] a,int i,int j) {
        if(i < 0) {
            return true;
        }
        if(a[i][j] <= 0) {
            return false;
        }
        return CheckAbove(a,i-1,j);
    }
    public static boolean CheckBelow(int [][]a,int i,int j) {
        if(i==a.length) {
            return true;
        }
        if(a[i][j]>=0) {
            return false;
        }
        return CheckBelow(a,i+1,j);
    }
}
