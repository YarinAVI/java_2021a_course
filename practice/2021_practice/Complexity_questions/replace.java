package Complexity_questions;

public class replace {
    public static void main(String[] args) {
        int arr[] = {6,7,4,3,5,2};
        replace(arr);
    }
    public static void replace(int []a) {
        int max = 0;
        for(int i=a.length-1;i>=0;i--) {
            int temp = max;
            max = a[i] > max ? a[i] : max;
            a[i] = temp;
        }
    }
}
