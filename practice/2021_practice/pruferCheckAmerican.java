public class pruferCheckAmerican {
    public static void main(String[] args) {
        System.out.println(relation(4,""));
    }
    public static int relation(int n,String path) {
        if(n==0) {
            int c=0;
            for(int i=0;i<path.length();i++) {
                if(path.charAt(i)=='1') c++;
            }
            if(c==3) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<7;i++) {
            res+=relation(n-1,path+i);
        }
        return res;
    }
}
