package recursion;

public class count {
    public static void main(String[] args) {
        System.out.println(count(7));
    }

    public static int count(int sum) {
        return count(sum,1,"");
    }
    public static int count(int sum,int currNum,String path) {
        if(sum==0) {
            System.out.println(path);
            return 1;
        }
        if(currNum > sum) {
            return 0;
        }
        return count(sum-currNum,currNum+1,path+currNum+",") + count(sum,currNum+1,path);
    }
}
