package Discrete_math_sol;

public class PruferCheckMaman16 {
    public static void main(String[] args) {
        //System.out.println(relation(6,""));
        int res =0;
        for(char i='1';i<'9';i++) {
            res+=relationSeifbet(6,"",i);
        }
        System.out.println(res);
    }
    public static int relation(int n,String path) {
        if(n==0) {
            int a=0, b=0, c=0;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)=='1')a++;
                else if(path.charAt(i)=='2')b++;
                else if(path.charAt(i)=='3')c++;
                else if(path.charAt(i)>='4') {
                    return 0;
                }
            }
            if(a>=1 && b >=1 && c>=1) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<9;i++) {
            res+=relation(n-1,path+i);
        }
        return res;
    }
    public static int relationSeifbet(int n,String path,char x) {
        if(n==0) {
            int count =0;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)==x) {
                    count++;
                }
            }
            if(count==4) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<9;i++) {
            res+=relationSeifbet(n-1,path+i,x);
        }
        return res;
    }
}
