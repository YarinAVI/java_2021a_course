package recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum(20));
    }
    public static int sum(int sum) {
        return sum(sum,1,"");
    }
    public static int sum(int sum, int number,String Path) {
        if(sum==0) {
            System.out.println(Path);
            return 1;
        }
        else if(sum <0 || number>sum) {
            return 0;
        }
        return sum(sum-number,number+1,Path+number) + sum(sum,number+1,Path);
    }
}
