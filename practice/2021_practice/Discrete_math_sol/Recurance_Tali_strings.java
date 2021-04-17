package Discrete_math_sol;

public class Recurance_Tali_strings {
    public static void main(String[] args) {
        System.out.println("result is "+relation(10,"",false));
    }
    public static int relation(int n,String path,boolean takeEven) {
        if(n==0) {
            System.out.println(path);
            return 1;
        }
        int res =0;
        for(int i=1;i<=8;i++) {
            if(i%2==0 && !takeEven) {
                res+=relation(n-1,path+i,true);
            }
            else if(i%2!=0) {
                res+=relation(n-1,path+i,false);
            }
        }
        return res;

    }
}
