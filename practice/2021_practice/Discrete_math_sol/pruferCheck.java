package Discrete_math_sol;

public class pruferCheck {
    public static void main(String[] args) {
        System.out.println(relation(5,""));
    }
    public static int relation(int n,String path) {
        if(n==0) {
            boolean a = false , b = false , c = false , d = false;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)=='1' || path.charAt(i)=='2' || path.charAt(i)=='3') {
                    return 0;
                }
                else if(path.charAt(i)=='5') {
                    a = true;
                }
                else if(path.charAt(i)=='6') {
                    b = true;
                }
                else if(path.charAt(i)=='7') {
                    c = true;
                }
                else if(path.charAt(i)=='4') {
                    d = true;
                }
            }
            if( a && b && c && d) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<8;i++) {
            res+=relation(n-1,path+i);
        }
        return res;
    }
}
