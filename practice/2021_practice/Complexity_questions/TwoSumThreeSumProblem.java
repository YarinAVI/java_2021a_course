package Complexity_questions;

public class TwoSumThreeSumProblem {
    public static void main(String[] args) {
        int arr[] = {-2,3,5,7,12};
        System.out.println(sum2(arr,17));
        System.out.println(sum3(arr,17));
        System.out.println(sum2(arr,16));
        System.out.println(sum3(arr,16));
    }
    // n
    public static boolean sum2(int [] arr,int num) {
     int low =0,high = arr.length-1;
     while(low<high) {
         if(arr[low]+arr[high] == num) {
             System.out.println(arr[low]+"+"+arr[high]);
             return true;
         }
         else if(arr[low]+arr[high] > num) {
             high--;
         }
         else low++;
     }
     return false;
    }
    // n^2
    public static boolean sum3(int []arr,int num) {
        for(int i=0;i<arr.length;i++) {
            int target = num - arr[i];
            int low =i+1,high = arr.length-1;
            while(low<high) {
                if(arr[low]+arr[high] == target) {
                    System.out.println(arr[i] +"+"+arr[low]+"+"+arr[high]);
                    return true;
                }
                else if(arr[low]+arr[high] > target) {
                    high--;
                }
                else low++;
            }
        }
        return false;
    }
}
