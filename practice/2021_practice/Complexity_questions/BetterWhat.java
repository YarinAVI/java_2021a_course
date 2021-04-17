package Complexity_questions;

public class BetterWhat {
    public static void main(String[] args) {
        int arr[] = {20,30,5,10,2,1,20,30,1005};
        //           0  1  2 3  4 5  6 7  8
        System.out.println(betterWhat(arr,1005));
    }
    public static boolean betterWhat(int arr[],int num ) {
        int sum = arr[0];
        int i,j;
        for(i=0,j=1;j<arr.length;j++) {
            sum+=arr[j];
            if(sum == num) {
                return true;
            }
            else if(sum > num) {
                sum-=arr[i++];
            }
        }
        while(i<j) {
            sum-=arr[i++];
            if(sum==num) {
                return true;
            }
        }
        return false;
    }
}
