public class Solution {
    public static void main(String args[]) {
        int arr[] = {5,10,20,50};
        System.out.println(makeSum(arr,4,40));
    }
    public static int makeSum(int [] lengths ,int k, int num) {
        return help(lengths,k,num,0,0);
    }
    public static int help(int lengths[],int k,int target_sum,int sum,int index) {
        if(k<0 || sum > target_sum || index== lengths.length) return 0;
        else if(sum == target_sum) return 1;
        return help(lengths,k-1,target_sum,sum+lengths[index],index) + help(lengths,k-1,target_sum,sum+lengths[index+1],index+1);
    }
}
