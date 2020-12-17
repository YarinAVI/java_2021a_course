public class question {
    public static void main(String[] args) {
        power_set(new int [] {2,2,3,4,5,15},"",0);
    }
    public static void power_set(int []A ,String set,int index) {
        if(index==A.length) return;
        System.out.println(set);
        for(int i=index;i<A.length;i++) {
            power_set(A,set+A[i]+",",index+1);
        }
    }
}
