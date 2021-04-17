package recursion;

public class findNumInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,7,9};
        System.out.println(search(arr,0));
    }
    public static int search(int[] nums, int target) {
        if(nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        else if(nums.length == 2 ) {
            if(nums[0] == target) return 0;
            else if(nums[1] == target) return 1;
            return -1;
        }
        int pivot = findPivot(nums);
        int low=0,high =0;

        if(pivot == 0 )  { // no rotation:
            high = nums.length-1;
        }
        else {
            low = pivot;
            high = pivot-1;
        }
        int middle =0;
        while(low != high) {
            middle = (low + (high + (nums.length-1 - low))) % nums.length;
            if(nums[middle] == target) {
                return middle;
            }
            else if(nums[middle] > target) {
                high = middle-1;
                if(high <0) {
                    high = nums.length-1;
                }
            }
            else {
                low = middle +1;
                low %=nums.length;
            }
        }
        return nums[high] == target ? high : -1;


    }
    public static int findPivot(int []nums) {
        if(nums[0] < nums[nums.length-1]) {
            return 0;
        }
        int low = 0, high = nums.length-1;
        int middle =0;
        while(low <=high) {
            middle = low + (high-low)/2;
            if(nums[middle] < nums[middle-1]) {
                return middle;
            }
            else if(nums[middle] < nums[0]) {
                high = middle;
            }
            else low = middle+1;
        }
        return middle;
    }
}
