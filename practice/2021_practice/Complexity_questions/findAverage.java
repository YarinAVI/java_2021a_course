package Complexity_questions;

public class findAverage {
    public static void main(String[] args) {
        int arr[] = {2, 3, 8, 14, 15, 35};
        int x[]   = {2, 3, 8, 14, 15, 16};
        System.out.println(findAverage(x, 10));
    }
    public static boolean findAverage(int[] arr, double x) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            if (sum / ((high - low) + 1) == x) {
                System.out.println(low + "," + high);
                return true;
            } else if (sum / ((high - low) + 1) > x) {
                sum -= arr[high];
                high--;
            } else {
                sum -= arr[low];
                low++;
            }
        }
        System.out.println("Could not find avg X");
        return false;
    }
}
