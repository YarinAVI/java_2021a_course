package recursion;

public class subs {
    public static void main(String[] args) {
        String t = "234";
        subs(t,0);
    }
    public static void subs(String s,int x) {
        subs(s,"",0);
    }
    public static void subs(String s,String path,int i) {

        if(i==s.length()) {
            System.out.println(path);
            return;
        }

        subs(s,path+s.charAt(i)+",",i+1);
        subs(s,path,i+1);
    }
}
