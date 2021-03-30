public class waysLeftRight {
    public static void main(String[] args) {
        System.out.println(ways(2,4));
    }
    public static int ways(int n,int k) {
       return ways(n,k,"");
    }
    public static int ways(int n,int steps,String path) {
        if(n==0 && steps==0) {
            System.out.println(path);
            return 1;
        }
        else if(steps <=0 || n > steps) {
            return 0;
        }
        return ways(n+1,steps-1,path+"Left,") + ways(n-1,steps-1,path+"Right,");
    }
}
