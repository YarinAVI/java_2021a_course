package Complexity_questions;

public class countTriplets {
    public static void main(String[] args) {
        int arr[] = {-2,0,1,3};
        int arr1[] = {1,3,4,5,7};
        System.out.println(countTriplets(arr,2));
        System.out.println(countTriplets(arr1,12));
    }
    public static int countTriplets(int []arr,int num) {
        int c =0;
        for(int i=0;i<arr.length-2;i++) {
            c+=twoSum(arr,num-arr[i],i+1,arr.length-1);
        }
        return c;
    }
    public static int twoSum(int []arr,int Complement,int low,int high) {
        int c =0;
        while(low < high) {
            if(arr[low] + arr[high] < Complement) {

                c+= high -low;
                low++;
            }
            else if(arr[low] + arr[high] >= Complement) {
                high--;
            }
        }
        return c;
    }
}
