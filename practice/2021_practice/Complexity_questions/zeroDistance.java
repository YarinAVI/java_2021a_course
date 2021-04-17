package Complexity_questions;

public class zeroDistance {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1};
        zeroDistance(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
    }
    public static void zeroDistance(int []a) {
        int lastzeroIndex = -1;
        for(int i=0;i<a.length;i++) {
            if(a[i]==0) {
                lastzeroIndex = i;
            }
            else {
                a[i] = i-lastzeroIndex;
            }
        }
        for(int i=a.length-1;i>=0;i--) {
            if(a[i]==0) {
                lastzeroIndex = i;
            }
            else {
                a[i] = Math.min(Math.abs(lastzeroIndex-i),a[i]);
            }
        }
    }
}
