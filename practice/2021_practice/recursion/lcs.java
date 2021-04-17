package recursion;

public class lcs {
    public static void main(String[] args) {
        String a = "abcdefgh";
        String b = "bewxftjg";
        System.out.println(lcs(a,b));
        // longest common string
    }
    public static int lcs(String a, String b) {
        return lcs(a,b,0,0);
    }
    public static int lcs(String a,String b,int i,int count) {
        if(i==a.length()) {
            return count;
        }
        int x = findChar(a.charAt(i),b,0);
        if(x==-1) {
           return lcs(a,b,i+1,count);
        }
        return Math.max(lcs(a,b,i+1,count+1),lcs(a,b,i+1,count));
    }
    public static int findChar(char a,String b,int i) {
        if(i==b.length()) {
            return -1;
        }
        if(a == b.charAt(i)) {
            return i;
        }
        return findChar(a,b,i+1);
    }
}
