public class CheckTali {
    public static void main(String[] args) {
        System.out.println(relation(5,""));
    }
    public static int relation(int n,String path) {
        if(n==0) {
            int res = 1;
            for(int i=0;i<path.length();i++) {
                res*=Character.getNumericValue(path.charAt(i));
            }
            if(res==252) {
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res =0;
        for(int i=1;i<10;i++) {
           res+=relation(n-1,path+i);
        }
        return res;
    }
}
