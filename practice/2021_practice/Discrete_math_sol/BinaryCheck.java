package Discrete_math_sol;

public class BinaryCheck {
    public static void main(String[] args) {
        System.out.println(relation(11,"",false));
    }
    public static int relation( int n,String path,boolean takenOne) {
        if(n==0) {
            int c =0;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)=='1')c++;
            }
            if(c==4) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        if(!takenOne){
            res+=relation(n-1,path+"1",true);
        }
        res+=relation(n-1,path+"0",false);
        return res;
    }
}
