package Discrete_math_sol;

public class Recurance_zero {
    public static void main(String[] args) {
        System.out.println("result is " + relation(3,"",0));
    }
    public static int relation(int n,String Path,int zeroCounter) {
        if(n==0) {
            System.out.println(Path);
            return 1;
        }
        if(n-1 == 0 && ((zeroCounter%2)!=0)) {
            return relation(n-1,Path+"0",zeroCounter+1);
        }
        int res = 0;
        if(n-1 >0) res +=relation(n-1,Path+"0",zeroCounter+1);
        res+= relation(n-1,Path+"1",zeroCounter)+
                relation(n-1,Path+"2",zeroCounter)+
                relation(n-1,Path+"3",zeroCounter)+
                relation(n-1,Path+"4",zeroCounter);
        return res;
    }
}
