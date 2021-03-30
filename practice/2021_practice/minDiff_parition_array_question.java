public class minDiff_parition_array_question {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(minDiff(arr));
    }
    public static int minDiff(int []arr) {
        return minDiff(arr,0,"","",0,0);
    }
    public static int minDiff(int []arr,int index,String Path1,String Path2,int sum1,int sum2) {
        if (index == arr.length) {
            if(Path1.length()>1) {
               Path1 = Path1.substring(0,Path1.length()-1);
            }
            if(Path2.length() >1 ) {
                Path2 = Path2.substring(0,Path2.length()-1);
            }
            System.out.println(Path1+"<>"+Path2);
            System.out.println("Abs:"+Math.abs(sum1-sum2));
            return Math.abs(sum1-sum2);
        }
        return Math.min(minDiff(arr,index+1,Path1+arr[index]+"+",Path2,sum1+arr[index],sum2),
                minDiff(arr,index+1,Path1,Path2+arr[index]+"+",sum1,sum2+arr[index]));
    }
}
