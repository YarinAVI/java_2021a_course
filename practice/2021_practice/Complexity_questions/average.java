package Complexity_questions;

import javax.swing.text.AbstractDocument;

public class average {
    public static void main(String[] args) {
        int arr[] = {500,7,-2,10};
        System.out.println(average(arr));
    }
    public static int average (int []arr) {
        double leftSum =0;
        double rightSum =0;
        // prefix sum
        for(int i=0;i<arr.length-1;i++) {
            leftSum+=arr[i];
        }
        rightSum = arr[arr.length-1];
        double max = 0;
        int res = arr.length-2;
        for(int i=arr.length-2;i>=0;i--) {
            double avgLeft = (leftSum/(i+1));
            double avgRight =(rightSum/(arr.length-1-i));
            if(Math.abs(avgLeft - avgRight) > max) {
                res =i;
                max =Math.abs(avgLeft - avgRight);
            }
            rightSum+=arr[i];
            leftSum-=arr[i];
        }
        return res;
    }
}
