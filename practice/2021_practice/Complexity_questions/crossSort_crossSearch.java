package Complexity_questions;

public class crossSort_crossSearch {
    public static void main(String[] args) {
        int arr[] = {1,9,2,8,4,7,7,4,12};
        //           0 1 2 3 4 5 6 7 8
        //crossSort(arr);

        System.out.println();
        System.out.println(crossSearch(arr,7));
    }
    public static void crossSort(int []arr) {
        int [] temp = new int[arr.length];
        int p1 =0;
        int p2 = arr.length-1 - arr.length %2;
        int tempP =0;
        while(p1< arr.length && p2 >=0) {
            if(arr[p1] < arr[p2]) {
                temp[tempP++] = arr[p1];
                p1+=2;
            }
            else {
                temp[tempP++] = arr[p2];
                p2-=2;
            }
        }
        while(p1<arr.length) {
            temp[tempP++] = arr[p1];
            p1+=2;
        }
        while(p2>=0) {
            temp[tempP++] = arr[p2];
            p2-=2;
        }
        for(int i=0;i< arr.length;i++) {
            arr[i] = temp[i];
        }
    }
    public static int crossSearch(int []arr,int x) {
        // even bin search
        int low =0;
        int high = arr.length-1 - ((arr.length-1) %2);
        while(low <= high) {
            int middle = (low +(high-low) /2);
            middle+= middle%2; // ensures middle is even.
            if(arr[middle] == x) {
                return middle;
            }
            else if(arr[middle] > x) {
                high = middle-2;
            }
            else low = middle+2;
        }
        // odd bin search
        high = 1;
        low = arr.length-1 - (arr.length %2);
        while(low >= high) {
            int middle = high + (low-high) /2;
            middle = middle %2 ==0 ? middle+1 : middle; // ensures middle is odd
            if(arr[middle] == x) {
                return middle;
            }
            else if(arr[middle] > x) {
                high = middle+2;
            }
            else low = middle-2;
        }
        return -1;
    }
}
