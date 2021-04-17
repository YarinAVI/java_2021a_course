package Complexity_questions;

public class maximalDrop {
    public static void main(String[] args) {
        int arr[]  = {5,21,3,22,12,7,27,6,4};
        int x[]    = {5,21,3,22,12,7,27,4,6};
        int k[] = {5,21,3,22,12,7,26,14};
        int f[] = {5,15,3,22,12,7,27,14};
        // 1,2,3,4,5,6,7,8,9
        System.out.println(maximalDrop(f));
    }
    public static int maximalDrop(int a[]) {
        int min = a[a.length-1];
        int minInd = a.length-1;
        int max = a[a.length-2];
        int maxInd = a.length-2;
        int i=0;
        int maxDrop = 0;
        for( i=a.length-2;i>0;i--) {
            if(max > min) {
                break;
            }
            max = a[i-1];
            maxInd = i-1;
            min = a[i];
            minInd = i;
        }
        if(i==0) {
            return maxDrop;
        }
        for(;i>0;i--) {
            if(maxInd<minInd) {
                maxDrop = Math.max(maxDrop, max - min);
            }
            if(a[i-1] > max ) {
                max = a[i-1];
                maxInd = i-1;
            }
            if(a[i] < min) {
                min = a[i];
                minInd = i;
                if(i<maxInd) {
                    maxInd = i-1;
                    max = a[i-1];
                }
            }
        }
        return maxDrop;
    }
}
