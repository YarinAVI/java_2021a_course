package recursion;

public class matchPattern {
    public static void main(String[] args) {
        int match[] = {2,3,573,4,34,35};
        int pattern[] = {1,0,2};
        System.out.println(match(match,pattern));
    }
    //0 1 2   3 4  5
    //2,3,573,4,34,35

    public static boolean match(int a[],int pattern[]) {
        if(pattern.length>a.length) {
            return false;
        }
        return match(a,pattern,0);
    }
    public static boolean match(int []a,int pattern[],int i) {
        boolean res = matchFromIndex(a,pattern,i,0);
        if(i+(pattern.length-1)<a.length) {
            return res || match(a,pattern,i+1);
        }
        return res;
    }
    public static boolean matchFromIndex(int a[],int pattern[],int i,int j) {
        boolean res = false;
        switch (pattern[j]) {
            case 0:
                if(a[i]/100 ==0) {
                    res = true;
                }
                break;
            case 1:
                if(a[i]/10 == 0) {
                    res = true;
                }
                break;
            case 2:
                if(a[i]/100 == 0 && a[i]/10!=0) {
                    res = true;
                }
                break;
        }
        if(j+1 < pattern.length) {
            return res && matchFromIndex(a,pattern,i+1,j+1);
        }
        return res;
    }
}
