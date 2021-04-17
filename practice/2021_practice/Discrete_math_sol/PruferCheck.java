package Discrete_math_sol;

public class PruferCheck {
    public static void main(String[] args) {
        System.out.println(relation(5,""));
        //System.out.println(checkGimel(5,""));
    }
    public static int checkGimel(int n,String Path) {
        if(n==0) {
            int a=0,b=0,c=0;
            for(int i=0;i< Path.length();i++) {
                if(Path.charAt(i)=='2') {
                    a++;
                }
                else if( Path.charAt(i)=='4') {
                    b++;
                }
                else if(Path.charAt(i)=='6') {
                    c++;
                }
            }
            if(c<1 || a <1 || b <1) {
                System.out.println(Path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<8;i++) {
            res+=checkGimel(n-1,Path+i);
        }
        return res;
    }
    public static int relation(int n,String Path) {
        if(n==0) {
            for(int i=0;i< Path.length();i++) {
                if(Path.charAt(i)=='2') {
                    System.out.println(Path);
                    return 1;
                }
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<8;i++) {
            res+=relation(n-1,Path+i);
        }
        return res;
    }
}
