package Discrete_math_sol;

public class Combi_Question_book_online {
    public static void main(String[] args) {
        System.out.println(relation(5,"",2));
    }
    public static int relation(int n,String Path,int start) {
        if(n==0) {
            System.out.println(Path);
            return 1;
        }
        int res = 0 ;
        for(int i=start;i<=8;i++) {
            res+=relation(n-1,Path+i,i);
        }
        return res;
    }
}
