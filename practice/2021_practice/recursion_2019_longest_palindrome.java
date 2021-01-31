public class recursion_2019_longest_palindrome {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,10,10,3,2,4};
        int test[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(longestPalindrome(test));
        System.out.println(longestPalindrome(arr));
    }
    public static int longestPalindrome(int arr[]) {
        return longestPalindrome(arr,0,arr.length-1);
    }
    public static boolean CheckIfPalindrome(int arr[],int low,int high) {
        if(low>=high) {
            return true;
        }
        if(arr[low]!=arr[high]) {
            return false;
        }
        return CheckIfPalindrome(arr,low+1,high-1);
    }
    public static int longestPalindrome(int arr[],int low,int high) {
        // its a palindrome ? cool return the indexs distance
        if(CheckIfPalindrome(arr,low,high)) {
            return (high-low)+1;
        }
        // well its not a palindrome but if we cut it from the left or cut it from the right it might be, well we need to check both options
        // just return the maximum from these options.
        return Math.max(longestPalindrome(arr,low+1,high),longestPalindrome(arr,low,high-1));
    }
}
