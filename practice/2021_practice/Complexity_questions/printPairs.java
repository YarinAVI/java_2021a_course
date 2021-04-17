package Complexity_questions;

public class printPairs {
    public static void main(String[] args) {
        //            0  1 2 3 4 5 6  7  8  9  10 11
        int arr[] = {-7,-3,0,1,3,5,12,14,17,19,25,30};
        printPairs(arr,2);
    }
    public static void printPairs(int arr[],int k) {
        int left = 0, right = 0;
        while(right < arr.length) {
            if(arr[right] - arr[left] == k) {
                System.out.println("Pair Found: ("+arr[left]+","+arr[right]+")");
                right++;
                left++;
            }
            else if(arr[right] - arr[left] > k) {
                left++;
            }
            else right++;
        }
    }
}
