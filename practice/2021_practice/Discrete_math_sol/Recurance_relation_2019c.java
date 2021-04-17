package Discrete_math_sol;

public class Recurance_relation_2019c {
    public static void main(String[] args) {
        System.out.println(relation(3,"",0,0,0));
    }
    public static int relation(int n,String Path,int even , int odd,int sum) {
        if(n==0) {
            System.out.println(Path+" = "+sum);
            return 1;
        }
        if(n-1 == 0) {
            if(odd%2 ==0) {
                return relation(n-1,Path+'2',even+1,odd,sum+2);
            }
            else {
                return relation(n-1,Path+'1',even,odd+1,sum+1) + relation(n-1,Path+'3',even,odd+1,sum+3);
            }
        }
        return relation(n-1,Path+'1',even,odd+1,sum+1) + relation(n-1,Path+'2',even+1,odd,sum+2) +relation(n-1,Path+'3',even,odd+1,sum+3);
    }
}
