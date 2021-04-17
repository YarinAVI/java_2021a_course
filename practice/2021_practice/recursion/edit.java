package recursion;

public class edit {
    public static void main(String[] args) {
        System.out.println(edit("HELLO world","hello WORLD"));
    }
    public static int edit(String str1, String str2) {
        int hash1[] = new int[95];
        int hash2[] = new int[95];
        if(str1.length()==0) {
            return str2.length();
        }
        if(str2.length() ==0) {
            return str1.length();
        }
        edit(str1,hash1,0);
        edit(str2,hash2,0);
        return distance(hash1,hash2,0);
    }
    public static void edit(String X,int hash[],int i) {
        hash[X.charAt(i)-32]++;
        if(i+1<X
                .length()) {
            edit(X,hash,i+1);
        }
    }
    public static int distance(int hash1[],int hash2[],int i) {
        if(i==95)  {
            return 0;
        }
        return Math.abs(hash1[i]-hash2[i]) + distance(hash1,hash2,i+1);
    }
}
