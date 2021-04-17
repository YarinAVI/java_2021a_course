package recursion;

public class histabrot {
    public static void main(String[] args) {
     //   System.out.println(relation(5,"",0,0));
        System.out.println(relation2(1,""));
    }
    public static int test(int n,String path) {
        if(n==0) {
            int cC=0,nC=0;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)>='0' && path.charAt(i)<='9') {
                    nC++;
                }
                else if(path.charAt(i)>='a' && path.charAt(i)<='z') {
                    cC++;
                }
            }
            if(cC==2 && nC==3) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(char i = '0';i<='z';i++) {
            if(i>'9' && i <'a') {
                continue;
            }
            res+=test(n-1,path+i);
        }
        return res;
    }
    public static int relation(int n,String path,int numberCount,int charCount) {
        if(n==0) {
            System.out.println(path);
            return 1;
        }
        int res =0;
        for(char i = '0';i<='z';i++) {
            if(i>'9' && i <'a') {
                continue;
            }
            if(i>='0' && i<='9' && numberCount<3) {
                res+=relation(n-1,path+i,numberCount+1,charCount);
            }
            else if(i>'9' && charCount <2) {
                res+=relation(n-1,path+i,numberCount,charCount+1);
            }

        }
        return res;
    }
    public static int relation2(int n,String path) {
        if(n==6) {
            System.out.println(path);
            return 1;
        }
        int res =0;
        if(n==1 || n==4 || n == 5) {
            for(int i=0;i<10;i++) {
                res+=relation2(n+1,path+i);
            }
        }
        else {
            for(char c ='a';c<='z';c++) {
                res+=relation2(n+1,path+c);
            }
        }
        return res;
    }
}
