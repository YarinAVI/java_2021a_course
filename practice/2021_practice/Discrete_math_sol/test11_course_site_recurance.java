package Discrete_math_sol;

public class test11_course_site_recurance {
    public static void main(String[] args) {
        System.out.println(relation(3,"",false));
    }
    public static int  relation (int n,String path,boolean takeWord) {
        if(n==0) {
            System.out.println(path);
            return 1;
        }
        int res = 0;
        if(n-1 ==0 || takeWord) {
            for(int i=1;i<7;i++) {
                res +=relation(n-1,path+i,false);
            }
            return res;
        }
        for(int i=1;i<7;i++) {
            res +=relation(n-1,path+i,false);
        }
        for(char i='a';i<'m';i++) {
            res+=relation(n-1,path+i,true);
        }
        return res;
    }
}
