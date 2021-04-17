package recursion;

public class testIsSumMatan {
    public static void main(String[] args) {
        int f[] = {0,0,0,0,0,0,0,90,10,100,0};
        System.out.println(isSum(f,200));
    }
    public static boolean isSum(int []a, int num)
    {
        return isSum(a, num, 0, 0);
    }

    private static boolean isSum(int []a, int num, int p1, int index)
    {
        if (p1 > a.length-1)
            return (index != 3 && num == 0);
        if (index == 3)
            return isSum(a, num+a[p1-1], p1+1, 0);
        return isSum(a, num-a[p1], p1+1, index+1) || isSum(a, num, p1+1, index);

    }
}
