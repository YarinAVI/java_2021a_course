package recursion;

public class isSumNotConsecutive3 {
    public static void main(String[] args) {

        int a[] = {4,2,3,1};
        System.out.println(isSum(a,9));
        int test[] = {54,10,2,5,4,3,9,7,8,1};
        System.out.println(isSum(test,55));
        int k[] = {30,40,10,2,3,7,10,10,5,6,3030,400};
        System.out.println(isSum(k,3436));
        int s[] = {1,2,3,100,100,100,4,5,6,7};


        int f[] = {0,1,90,10,100,1};
        System.out.println(isSum(f,200));

    }
    public static boolean isSum(int []a,int num) {
        return isSum(a,num,1,"",0,0);
    }
    public static boolean isSum(int []a,int num,int ConsecutiveCounter,String path,int index,int prevIndex) {
        if(num == 0 && ConsecutiveCounter <3) {
            System.out.println(path);
            return true;
        }
        if(index>=a.length || num < 0) {
            return false;
        }
        if(index - prevIndex ==1) {
            return isSum(a,num-a[index],ConsecutiveCounter+1,path+a[index]+",",index+1,index) |
                    isSum(a,num,ConsecutiveCounter,path,index+1,-2);
        }
        return isSum(a,num-a[index],ConsecutiveCounter,path+a[index]+",",index+1,index) |
                isSum(a,num,ConsecutiveCounter,path,index+1,-2);
    }
}
