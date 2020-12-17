public class question1 {
    public static void main(String[] args) {
        printAllSum(new int[] {1,1,3,7},6);
    }
    public static void printAllSum(int []a,int sum) {
        printAllSum(a,sum,"",0);
    }
    public static void printAllSum(int []a,int sum,String comb,int index) {
        if(sum==0) System.out.println(comb);
        if(sum<0 || index >= a.length) return;
        printAllSum(a,sum-a[index],comb+"1",index+1);
        printAllSum(a,sum,comb+"0",index+1);
    }
}
