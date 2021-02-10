public class how_many_sorte {
    public static void main(String[] args) {
        System.out.println(howManySorted(3,2));
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
}
