package Complexity_questions;

public class smallestSub {
    public static void main(String[] args) {
        int arr[] ={1,4,13,6,0,19};
        System.out.println(smallestSub(arr,260));
    }
    public static int smallestSub(int a[],int k) {
        int min = a.length+1;
        int currSum = 0;
        for(int i=0,j=0;i<a.length;i++) {
            while(currSum<=k && j<a.length) {
                currSum+=a[j];
                j++;
            }
            if(currSum > k && ((j-i))<min) {
                    min = j-i;
            }
            currSum-=a[i];
        }
        return min;
    }
}
