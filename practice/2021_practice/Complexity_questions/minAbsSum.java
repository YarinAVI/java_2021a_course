package Complexity_questions;

public class minAbsSum {
    public static void main(String[] args) {
        int arr[] = {-1,3,5,7,8,11,17,25,30,36};
        int test[] = {-60,-50,-40,-30,-20,-10,0,110,222,333,444,555,666,777};
        System.out.println(minAbsSum(test));
    }
    public static int minAbsSum(int []a) {
        // just find the minimum absolute number:
        int left = 0, right = a.length-1,mid =0;
        int absMinIndex = 0 ;
        int absMin = Integer.MAX_VALUE;
        while(left<=right) {
            mid = left + ((right-left) / 2);
            if(Math.abs(a[mid]) < absMin) {
                absMin = Math.abs(a[mid]);
                absMinIndex = mid;
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        if(absMinIndex+1<a.length && absMinIndex-1 >=0) {
            return Math.min(Math.abs(absMin+a[absMinIndex+1]),Math.abs(absMin+a[absMinIndex-1]));
        }
        else if(absMinIndex+1<a.length) {
            return Math.abs(absMin+a[absMinIndex+1]);
        }
        return Math.abs(absMin+a[absMinIndex-1]);
    }
}
