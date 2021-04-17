package recursion;

public class pathExists {
    public static void main(String[] args) {
        int arr[] = {34,59,74,12,15,17};
        System.out.println(pathExists(arr));
    }
    public static boolean pathExists(int []a) {
        return pathExists(a,0,"");
    }
    public static boolean pathExists(int []a,int i,String path) {
        if(i>=a.length) {
            return false;
        }
        if(i==a.length-1) {
            System.out.println(path);
            return true;
        }
        if(a[i]/10 >0) {
            if(a[i]%10 > 0) {
                return pathExists(a,i+(a[i]%10),path+(a[i]%10)+",") | pathExists(a,i+(a[i]/10),path+(a[i]/10)+",");
            }
        }
        return pathExists(a,i+(a[i]%10),path+(a[i]%10)+",");
    }
}
