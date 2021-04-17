package Complexity_questions;

public class printTriplets {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,7,8,9};
        printTriplets(a,40);
    }
    public static void printTriplets(int [] a,int num) {
        for(int i=0;i<a.length;i++) {
            findTwo(a,num/a[i],i+1,a.length-1,a[i]);
        }
    }
    public static void findTwo(int a[],int target,int low,int high, int ref ) {
        while(low<high) {
            if(a[low] * a[high] > target) {
                high--;
            }
            else if(a[low] * a[high] < target) {
                low++;
            }
            else  {
                System.out.println(ref + "*"+a[low]+"*"+a[high]);
                return;
            }
        }
    }
}
