package Complexity_questions;

public class minimalPositive {
    public static void main(String[] args) {
        Range a[] = new Range[4];
        a[0] = new Range(-7,-3);
        a[1] = new Range(-1,-1);
        a[2] = new Range(4,6);
        a[3] = new Range(20,22);
        System.out.println(minimalPositive(a));
    }

    public static int minimalPositive(Range arr[]) {
        if(arr[0]._small >0) {
            return arr[0]._small;
        }
        if(arr[arr.length-1]._big <=0) {
            return -1;
        }
        int low =0,high = arr.length-1;
        int middle =0;
        
        while(low <=high) {
            middle = low + (high-low)/2;
            if(arr[middle]._small<=0 && arr[middle]._big>0) {
                return 1;
            }
            else if(arr[middle]._small<=0 && arr[middle]._big<=0) {
                low = middle+1;
            }
            else if(arr[middle]._small>0) {
                high = middle -1;
            }
        }
        return arr[middle]._small;
    }
    public static class Range {
        public int _small,_big;
        public Range(int s,int b) {
            _small =s;
            _big = b;
        }
        public int getSmall() {
            return _small;
        }
        public int getBig() {
            return _big;
        }
    }
}