package Complexity_questions;

public class printClosest {
    public static void main(String[] args) {
        int a[] = {0,4,6,11,11};
        int b[] = {10,20,30,40};
        printClosest(a,b,70);
    }
    public static void printClosest(int []a,int []b,int x) {
        int low = 0;
        int high = b.length-1;
        int minDistance = Integer.MAX_VALUE;
        int aIndex =0, bIndex = 0;
        while(low < a.length && high>=0) {
            if(a[low] + b[high] == x) {
                System.out.println(a[low] + " and "+b[high]);
                return;
            }
            else if(a[low]+b[high] > x) {
                if((Math.abs(a[low]+b[high])-x) < minDistance) {
                    minDistance = Math.abs(a[low]+b[high]-x);
                    aIndex = low;
                    bIndex = high;
                }
                high--;
            }
            else {
                if((Math.abs(a[low]+b[high])-x) < minDistance) {
                    minDistance = Math.abs(a[low]+b[high]-x);
                    aIndex = low;
                    bIndex = high;
                }
                low++;
            }
        }
        System.out.println(a[aIndex]+" and "+b[bIndex]);
    }
}
