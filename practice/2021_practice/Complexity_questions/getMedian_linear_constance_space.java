package Complexity_questions;

public class getMedian_linear_constance_space {
    public static void main(String[] args) {
        int a[] = {1,12,15,26,37};
        //               ^
        int x[] = {10,20,30,40,50};
        int b[] = {12,13,18,30,45};
        //               ^
        System.out.println(getMedian(x,a));
    }
    public static int getMedian(int []a,int[]b) {
        int aP=0,bP=0;
        for(int i=0;i<a.length-1;i++) {
            if(a[aP] <= b[bP]) {
                aP++;
            }
            else bP++;
        }
        return (a[aP] + b[bP] ) /2;
    }
}
