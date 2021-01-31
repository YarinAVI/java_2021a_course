public class testSum {
    public static void main(String[] args) {
        int a[] = {3,52,500,53,54,69,1000,90,100,80,70};
        System.out.println(isSumOf(a,110));
    }
    public static boolean isSumOf(int[] s, int n)
    {
        return isSumOf(s,n,0,"");
    }

    private static boolean isSumOf(int[] s, int n, int i,String sol)
    {
        if (n < 0)
            return false;
        else if (n == 0)
        {
            System.out.println(sol);
            return true;
        }
        if (i == s.length)
            return false;
        return isSumOf(s,n - s[i],i, s[i] +" "+ sol ) || isSumOf(s,n,i+1,sol);
    }
}
