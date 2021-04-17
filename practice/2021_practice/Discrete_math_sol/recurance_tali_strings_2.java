package Discrete_math_sol;

public class recurance_tali_strings_2 {
    public static void main(String[] args) {
        System.out.println(relation(3,"",false));
    }
    public static int relation(int n,String Path,boolean didTakeLetter) {
        if(n==0) {
            System.out.println(Path);
            return 1;
        }
        int res =0;
        if(n-1 == 0 || didTakeLetter) {
            res+=relation(n-1,Path+"1",false) + relation(n-1,Path+"2",false);
        }
        else {
            res+=relation(n-1,Path+"1",false) + relation(n-1,Path+"2",false);
            res+=relation(n-1,Path+"a",true)+
                    relation(n-1,Path+"b",true)+
                    relation(n-1,Path+"c",true)+
                    relation(n-1,Path+"d",true);

        }
        return res;
    }
}
