public class print_power_set_recursive {
    public static void main(String[] args) {
        System.out.println(power_set(new int [] {1,2,3,4,5,6},"{",0));
    }
    public static int power_set(int []A ,String set,int index) {
        if(index==A.length) return 1;

        System.out.println(set+A[index]+"}");
       return power_set(A,set,index+1) + power_set(A,set+A[index]+",",index+1);
    }
}
