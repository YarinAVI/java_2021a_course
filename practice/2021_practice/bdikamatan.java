public class bdikamatan {
    public static void main (String[]args)
    {
        int []arr = {2, 15, 3, 4, 2, 5};
        System.out.println(splitEqualMult(arr));
    }
    public static boolean splitEqualMult(int []a)
    {
        return splitEqualMult(a, 1, 1, 0, a.length-1);
    }
    private static boolean splitEqualMult(int []a, int sumA, int sumB,int start, int end)
    {
        if (start == a.length || end == -1) {
            System.out.println("SumB:" + sumB + " SumA:" + sumA);
            return (sumA == sumB);

        }
        return splitEqualMult(a, sumA*a[start], sumB, start+1, end) ||
                splitEqualMult(a, sumA, sumB*a[end], start, end-1) ;
    }
}
