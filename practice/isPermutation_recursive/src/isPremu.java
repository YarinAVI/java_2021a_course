public class isPremu {
    public static void main(String[] args) {
        // written by yarin avisidris
        int A[] = {3,2,4,1};
        int B[] = {1,2,3,4};
        System.out.println(isPermutation(A,B));
        System.out.println(permutation(A,B,0,0));
    }
    public static boolean isPermutation (int[] a,int[] b) {
        if(a.length!=b.length) return false;
        boolean hash[] = new boolean[b.length]; // dosnt matter they are the same length.
        return isPermutation(a,b,0,hash);
    }
    public static boolean isPermutation(int []a, int []b,int i,boolean hash[]) {
        boolean result = findElementFromAinB(a[i],b,0,hash);
        if(i<a.length-1) {
            return result && isPermutation(a,b,i+1,hash);
        }
        return result;
    }
    private static boolean findElementFromAinB(int a ,int []b, int i, boolean hash[]) {
        if(i==b.length) return false;
        if (b[i]==a && hash[i]== false) {
            hash[i] = true; // set it to true so we know we used the number
            return true;
        }
        return findElementFromAinB(a,b,i+1,hash);
    }
    static boolean permutation(int a[],int b[],int i,int j) {
        if(a.length==i) {
            return false;
        }
        if(b.length==j) {
            return false;
        }
        if(a.length!= b.length) {
            return false;
        }
        if(a[i]!=b[j]) {
            return permutation(a,b,i,j+1);
        }
        if(a[i]==b[j]) {
            j=0;
        }
        return permutation(a,b,i+1,j);
    }
}
