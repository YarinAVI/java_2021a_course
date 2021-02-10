public class oneFiveSeven {
    public static void main(String[] args) {
        System.out.println(oneFiveSeven(10));
    }
    public static int oneFiveSeven(int n) {
        return oneFiveSeven(n,0);
    }
    public static int oneFiveSeven(int n,int steps) {
        if(n==0) {
            return steps;
        }
        else if(n<0) {
            return Integer.MAX_VALUE;
        }
        return Math.min(Math.min(oneFiveSeven(n-1,steps+1),oneFiveSeven(n-5,steps+1)),oneFiveSeven(n-7,steps+1));
    }
}
