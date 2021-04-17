package Complexity_questions;

public class strictlyIncreasing {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5};
        System.out.println(strictlyIncreasing(arr));
    }
    public static int strictlyIncreasing(int []a) {
        int c = 0;
        int res =0;
        for(int i=0;i<a.length-1;i++) {
            if(a[i]<a[i+1]) {
                c++;
            }
            else c=0;
            res+=c;
        }
        return res;
    }
}
