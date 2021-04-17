package Discrete_math_sol;

public class strings_question_discrete_math {
    public static void main(String[] args) {
        System.out.println(buildString(7,"",1,3,3));
    }
    public static int buildString(int n,String path,int C,int A,int B) {
        if(n==0) {
            System.out.println(path);
            return 1;
        }
        int res =0;
        if(path.length()>=2) {
            if( (path.charAt(path.length()-1)!='B' || path.charAt(path.length()-2)!='A') && C>0){
                res+=buildString(n-1,path+'C',C-1,A,B);
            }
            if((path.charAt(path.length()-1)!='C' || path.charAt(path.length()-2)!='B') && A>0) {
                res+=buildString(n-1,path+'A',C,A-1,B);
            }
            if((path.charAt(path.length()-1)!='A' || path.charAt(path.length()-2)!='C') && B>0) {
                res+=buildString(n-1,path+'B',C,A,B-1);
            }
            return res;
        }
        if(C>0) {
            res += buildString(n - 1, path + 'C', C - 1, A, B);
        }
        if(A>0) {
            res += buildString(n - 1, path + 'A', C, A - 1, B);
        }
        if(B>0) {
            res += buildString(n - 1, path + 'B', C, A, B - 1);
        }
        return res;
    }
}
