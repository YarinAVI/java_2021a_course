package Complexity_questions;

public class meetingPoint {
    public static void main(String[] args) {
        int a[] = {19, 19, 16, 15, 15, 15, 15, 13, 5};
        int z[] = {0, 12, 13, 15, 15, 15, 15, 19, 25,30,40,100};
        int b[] = {0, 12, 13, 14, 14, 15, 15, 19, 25, 30, 35};
        int a1[] = {100,90,80,70,60,50,40,30,20,10};
        int b1[] = {20,30,40,50,70,70,80,90,100,120};
        System.out.println(meetingPoint(a,z));
    }
    public static int meetingPoint(int a[],int b[]) {
        int min = Math.min(a.length,b.length);
        int low =0, high = min-1;
        while(low <=high) {
            int middle = low +(high - low) /2;
            if(a[middle] > b[middle]) {
                low = middle +1;
            }
            else  {
                if(a[middle] == b[middle] ) min = middle;
                high = middle-1;
            }
        }
        return min == Math.min(a.length,b.length) ? -1 : min;
    }
}
