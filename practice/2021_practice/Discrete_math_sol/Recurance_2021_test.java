package Discrete_math_sol;

public class Recurance_2021_test {
    public static void main(String[] args) {
        System.out.println(relation(3,"",false));
    }
    public static int relation(int n,String path,boolean takeNum) {
        if(n==0) {
            System.out.println(path);
            return 1;
        }
        int res =0;
        if(!takeNum) {
            for(int i=1;i<5;i++) {
                res+=relation(n-1,path+i,true);
            }
        }
        res+=relation(n-1,path+'a',false) + relation(n-1,path+'b',false);
        return res;
    }
}
