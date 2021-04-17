package Discrete_math_sol;

public class matanRecurance {
    public static void main(String[] args) {
        System.out.println("Result is:"+ relation(2,"",false));
    }
    public static int relation(int n,String Path,boolean parity) {
        if(n==0) {
            System.out.println(Path);
            return 1;
        }
        int res =0;
        if(n-1 == 0) {
            for(int i=1;i<8;i+=2) {
                res+=relation(n-1,Path+i,false);
            }
            return res;
        }

        for(int i=1;i<8;i++) {
            if(!parity && i%2==0) {
                res+=relation(n-1,Path+i,true);
            }
            else if(i%2!=0) {
                res+=relation(n-1,Path+i,false);
            }
        }
        return res;
    }
}
