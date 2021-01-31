public class Power_set_count_Even {
    // the following code will print all the subset of the given array such that their SUM is bigger than the given target sum.
    public static void main(String[] args) {
        System.out.println(power_set(new int [] {1,2,3,4,5,6,7,8,9},"{",0));
    }
    public static int power_set(int []A ,String set,int index) {
        if(index==A.length) {
            int i=0;
            for(i=0;i<set.length();i++) {
                if(set.charAt(i)=='}' || set.charAt(i)=='{' || set.charAt(i)==',') continue;
                else if(set.charAt(i)%2!=0) {
                    break;
                }
            }
            if(i==set.length()) {
                System.out.println(set+"}");
                return 1;
            }
            else return 0;
        }


        return power_set(A,set,index+1) + power_set(A,set+A[index]+",",index+1);
    }
}
