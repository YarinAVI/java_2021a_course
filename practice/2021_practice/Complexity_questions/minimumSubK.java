package Complexity_questions;

public class minimumSubK {
    public static void main(String[] args) {
        int arr[] = {10,4,2,5,6,3,8,1,5,9};
        minimumSubK(arr,2);
    }
    public static void minimumSubK(int []arr,int k) {
        int min = 0;
        int sum = 0;
        int i=0,j=0;
        for(;i<k;i++) {
            min+=arr[i];
        }
        sum = min;
        int lowIndex = 0, highIndex =k-1;
        for(i=0,j=k;j<arr.length;j++,i++) {
            sum+=arr[j];
            sum-=arr[i];
            if(sum < min) {
                min = sum;
                lowIndex = i+1;
                highIndex = j;
            }
        }
        System.out.println("Minimum sum sub-array is ("+lowIndex+","+highIndex+")");
    }
}
