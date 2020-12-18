public class q1 {
    public static void main(String[] args) {
        int k[] = {2,4,1,6,4,2,4,3,5};
        System.out.println(isWay(k));
    }
    public static boolean isWay(int []a){
        return isWay(a,0,"");
    }
    public static boolean isWay(int []a,int index,String path) {
        if(index >=a.length || index <0) return false;
        else if(index == a.length-1) {
            System.out.println(path+a[index]);
            return true;
        }
        boolean result = false;
        a[index] = -(a[index]);
        if((-(a[index]))>0) {
            result |=isWay(a,index+a[index],path+a[index]+"->") || isWay(a,index-a[index],path+a[index]+"->");
        }
        a[index] = -(a[index]);
        return result;
    }
}
