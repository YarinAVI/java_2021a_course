public class Check_123 {
    public static void main(String[] args) {
        System.out.println(relation(10,""));
    }
    public static int relation(int n,String path) {
        if(n==0) {
            int a=0,b=0,c=0;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)=='1') {
                    a++;
                }
                else if(path.charAt(i)=='2') {
                    b++;
                }
                else if(path.charAt(i)=='3') {
                    c++;
                }
            }
            if(a >=1 && b>=1 && c>=1) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<4;i++) {
            res+=relation(n-1,path+i);
        }
        return res;
    }
}
