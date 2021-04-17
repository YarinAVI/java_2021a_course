package recursion;

public class specialPrint {
    public static void main(String[] args) {
        String t = "Java is a good language!";
        specialPrint(t);
    }
    public static void specialPrint(String s) {
        if(s.length()==0) {
            return;
        }
        if(s.charAt(0) == 'a') {
            System.out.println(s);
        }
        specialPrint(s.substring(1));
    }
    }
