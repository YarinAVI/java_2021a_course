package Discrete_math_sol;

public class Prufer_Q5Matan {
    public static void main(String[] args) {
        System.out.println(relation(5,""));
        //System.out.println(FullRelation(5,""));
        //System.out.println(ComplementRelation(5,""));
    }
    public static int relation(int n,String path) {
        if(n==0) {
            boolean a=false,b=false,c=false;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)== '1' || path.charAt(i)== '2'  || path.charAt(i)== '3' || path.charAt(i)=='4') {
                    return 0;
                }
                else if(path.charAt(i)=='5') a= true;
                else if(path.charAt(i)=='6') b= true;
                else if(path.charAt(i)=='7') c= true;
            }
            if(a && b && c) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<8;i++) {
            res+=relation(n-1,path+i);
        }
        return res;
    }
    public static int FullRelation(int n,String path) {
        if(n==0){
            System.out.println(path);
            return 1;
        }
        int res =0;
        for(int i=1;i<8;i++){
            res+=FullRelation(n-1,path+i);
        }
        return res;
    }
    public static int ComplementRelation(int n,String path) {
        if(n==0){
            boolean a=false,b=false,c=false;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)=='1') a=true;
                else if(path.charAt(i)=='2') b=true;
                else if(path.charAt(i)=='3') c=true;
            }
            if(a && b && c) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<8;i++){
            res+=ComplementRelation(n-1,path+i);
        }
        return res;
    }
}
