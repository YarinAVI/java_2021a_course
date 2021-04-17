package Discrete_math_sol;

public class Recurance_relation_matan {
    public static void main(String[] args) {
        System.out.println(relation(4,"",false,false,false));
    }
    public static int relation(int n,String Path,boolean take_a, boolean take_b,boolean take_number) {
        if(n==0) {
            System.out.println(Path);
            return 1;
        }
        if(take_a) {
            return relation(n-1,Path+"a",true,false,false)+
                    relation(n-1,Path+"b",false,true,false)+
                    relation(n-1,Path+"c",false,false,false)+
                    relation(n-1,Path+"2",false,false,true);
        }
        else if(take_b) {
           return relation(n-1,Path+"a",true,false,false)+
                    relation(n-1,Path+"b",false,true,false)+
                    relation(n-1,Path+"c",false,false,false)+
                    relation(n-1,Path+"1",false,false,true);
        }
        else if(take_number) {
            return relation(n-1,Path+"a",true,false,false)+
                    relation(n-1,Path+"b",false,true,false)+
                    relation(n-1,Path+"c",false,false,false);
        }
        return relation(n-1,Path+"a",true,false,false)+
                relation(n-1,Path+"b",false,true,false)+
                relation(n-1,Path+"c",false,false,false)+
                relation(n-1,Path+"1",false,false,true)+
                relation(n-1,Path+"2",false,false,true);
    }
}
