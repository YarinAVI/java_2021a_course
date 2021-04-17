package Complexity_questions;

public class findSmallest {
    public static void main(String[] args) {
        int arr[] = {1,2,6,10,11,15};

    }
    public static int findSmallest( int []arr) {
        int res = 0;
        for(int i=0;i< arr.length;i++) {
            if(res+1 < arr[i]) {
                return res+1;
            }
            res+=arr[i];
        }
        return res+1;
    }
}
