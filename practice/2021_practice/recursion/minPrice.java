package recursion;

public class minPrice {
    public static void main(String[] args) {
        int arr[][] = {{0, 15, 80, 90}, {-1, 0, 40, 50}, {-1, -1, 0, 70}, {-1, -1, -1, 0}};
        System.out.println(minPrice(arr));
    }
    public static int minPrice(int [][]mat) {
        return minPrice(mat,0,0,0);
    }
    public static int minPrice(int [][]mat,int i,int j,int price) {
        if(j==mat[0].length-1) {
            return price+mat[i][j];
        }
        if(mat[i][j] == 0) {
            return minPrice(mat,i,j+1,price);
        }
        return Math.min(minPrice(mat,i+1,j,price+mat[i][j]),minPrice(mat,i,j+1,price));
    }
}
