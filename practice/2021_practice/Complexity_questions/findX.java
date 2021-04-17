package Complexity_questions;

public class findX {
    public static void main(String[] args) {
        int arr[] = {1,6,3,6,30,9,40};
        System.out.println(findX(arr,9));
    }
    public static boolean findX(int a[],int x)  {
        if(a.length==1) {
            return false;
        }
        int i=0,j=0;
        int low = 0, high = a.length-1;
        while(low<=high) {
            i = (low+high)/2;
            j = i+1;
            if(a[i] + a[j] == x) {
                return true;
            }
            if(a[i]+ a[j] > x) {
                high = i-1;
            }
            else
                low = j+1;
        }
        return false;
    }
}
