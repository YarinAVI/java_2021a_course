// the following code will print all the subset of the given array such that their SUM is bigger than the given target sum.
public class print_subset_sum {
    public static void main(String[] args) {
        System.out.println(power_set(new int [] {1,11,100,1,0,200,3,2,1,250},"{",0,280));
    }
    public static int power_set(int []A ,String set,int index,int sum) {
        if(sum <0) {
            if(index < A.length) System.out.println(set+A[index]+"}");
            else if(index == A.length) System.out.println(set.substring(0,set.length()-1)+"}");
            return 1;
        }
        if(index == A.length) return 0;
       return  power_set(A,set+A[index]+",",index+1,sum-A[index]) + power_set(A,set,index+1,sum);
    }
}