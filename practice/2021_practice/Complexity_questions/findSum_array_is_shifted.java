package Complexity_questions;

public class findSum_array_is_shifted {
    public static void main(String[] args) {
        int arr[] = {65,70,-5,3,48,49,52};
        int arr1[] = {3,48,49,52,65,70,-5};
        // -5,3,48,49,52,65,70
        // {3,48,49,52,65,70,-5}
        System.out.println(findSum(arr1,44));
    }
    public static boolean findSum(int [] a,int sum) {
        // find the pivot:
        int lowPivot =0, highPivot=a.length-1;
        for(int i=0;i<a.length-1;i++) {
            if(a[i]>a[i+1]) {
                highPivot = i;
                lowPivot = i+1;
                break;
            }
        }
        // if it was sorted lowPivot and highPivot did not change
        while(lowPivot!=highPivot) {
            if(a[lowPivot] + a[highPivot] == sum) {
                System.out.println(a[lowPivot]+"+"+a[highPivot]);
                return true;
            }
            else if(a[lowPivot]+a[highPivot]>sum) {
                highPivot = (highPivot-1);
                if(highPivot==-1){
                    highPivot=a.length-1; // clamp
                }
            }
            else if(a[lowPivot]+a[highPivot]<sum) {
                lowPivot = (lowPivot+1);
                if(lowPivot==a.length) {
                    lowPivot = 0; // clamp
                }
            }
        }
        return false;
    }
}
