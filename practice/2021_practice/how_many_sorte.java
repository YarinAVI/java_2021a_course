public class how_many_sorte {
    public static void main(String[] args) {
        System.out.println(howManySorted(2,10));
        System.out.println(howManySorted1(2,10));
    }
    public static int howManySorted(int n,int max) {
        return howManySorted(n,max,"",1);
    }
    public static int howManySorted(int n,int max,String path,int currentNumber) {
        if(currentNumber > max) {
            return 0;
        }
        if(n==0) {
            System.out.println(path);
            return 1;
        }
        return howManySorted(n-1,max,path+currentNumber,currentNumber) + howManySorted(n,max,path,currentNumber+1);
    }
    public static int howManySorted1(int n,int max) {
        if(n==1 || max==1) {
            return max;
        }
        return howManySorted1(n-1,max) + howManySorted1(n,max-1);
    }
}
