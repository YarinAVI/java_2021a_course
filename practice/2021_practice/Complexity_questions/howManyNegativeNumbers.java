package Complexity_questions;

public class howManyNegativeNumbers {
    public static void main(String[] args) {
        int mat[][] = {{-99,-72,-64,-55,-28,-10,-5},{-72,-53,-46,-38,11,13,22},{-63,-48,-27,-12,14,16,23},{-44,-29,-10,0,18,20,28}};
        System.out.println(howManyNegativeNumbers(mat));
    }
    public static int howManyNegativeNumbers(int mat[][]) {
        //prefix
        int j=0;
        int res =0;
        for(;j<mat[0].length;j++){
            if(mat[0][j]>=0) {
                break;
            }
        }
        if(j==mat[0].length) {
            res+=j;
            j--;
        }
        else {
            res += j + 1;
        }
        for(int i=1;i<mat.length;i++) {
            while(j>=0 && mat[i][j]>=0  ) {
                j--;
            }
            if(j==-1) {
                return res;
            }
            res+=j+1;
        }
        return res;
    }
}
