package recursion;

public class palindromeMath {
    public static void main(String[] args) {
        System.out.println(relation(7,""));
    }
    public static boolean isPalindrom(String a) {
        for(int i=0,j=a.length()-1;i<j;i++,j--) {
            if(a.charAt(i)!=a.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static int relation(int n,String path) {
        if(n==0) {
            if(isPalindrom(path)){
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(char i='a';i<='e';i++) {
            res+=relation(n-1,path+i);
        }
        return res;
    }
}
