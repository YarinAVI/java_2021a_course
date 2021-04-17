package recursion;

public class findMaxPrice {
    public static void main(String[] args) {
        int prices[] = {0,1,3,10,9,10,17,17,20};
        System.out.println(findMaxPrice(prices,8));
    }
    public static int findMaxPrice(int []prices,int n) {
        return findMaxPrice(prices,n,1,0);
    }
    public static int findMaxPrice(int []prices,int n,int index,int priceSum) {
        if(n==0) {
            return priceSum;
        }
        if(n<0 || index == prices.length) {
            return Integer.MIN_VALUE;
        }
        return Math.max(findMaxPrice(prices,n-index,index,priceSum+prices[index]),findMaxPrice(prices,n,index+1,priceSum));
    }
}
