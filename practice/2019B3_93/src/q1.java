public class q1 {
    public static void main(String[] args) {
        int arr[] = {20,4,2,1,3};
        isSum(arr,8);
    }
    public static boolean isSum(int []a,int num) {
        return isSum(a,num,0,"");
    }
    public static boolean isSum(int []a,int num,int index,String subset) {
        if(num==0) {
            System.out.println(subset.substring(0,subset.length()-1));
            return true;
        }
        if(index >= a.length || num <0) return false;

        return isSum(a,num-a[index],index+2,subset+a[index]+"+")
                || isSum(a,num,index+1,subset);
    }
}
