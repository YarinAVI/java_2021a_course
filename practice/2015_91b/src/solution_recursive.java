public class solution_recursive {
    public static void main(String[] args) {
        int sticksLengths[] = {2,5,10,20,50};
        System.out.println(makeSum(sticksLengths,40,4));
    }
    public static int makeSum(int []lengths,int k,int num) {
        return makeSum(lengths,k,num,0,"");
    }
    private static int makeSum(int []lengths,int k,int num,int index,String path) {
        if(k <0 || index==lengths.length || num<0) {
            return 0;
        }
        if(k==0) {
            System.out.println(path);
            return 1;
        }
        return makeSum(lengths,k-lengths[index],num-1,index,path+lengths[index]+',') + makeSum(lengths,k,num,index+1,path);
    }
}
