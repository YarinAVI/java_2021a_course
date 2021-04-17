package recursion;

public class findMaximum {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, -1, 1, 1},
                       {1, 0, 0, -1, 1},
                        {1, 1, 1, 1, -1},
                        {-1, -1, 1, 1, 1},
                        {1, 1, -1, -1, 1}};
        System.out.println(findMaximum(mat));
    }

    public static int findMaximum(int[][] mat) {
        if(mat[0][0] == -1) {
            return -1;
        }
        return findMaximum(mat, 0, 0, 0);
    }

    public static int findMaximum(int[][] mat, int i, int j, int sum) {
        int a = -1, b = -1;
        if (i + 1 < mat.length && mat[i + 1][j] != -1) {
            a = findMaximum(mat, i + 1, j, sum + mat[i][j]);
        }
        if (i % 2 == 0) {
            if (j + 1 < mat[0].length && mat[i][j + 1] != -1) {
                b = findMaximum(mat, i, j + 1, sum + mat[i][j]);
            }
        } else {
            if(j-1 >-1 && mat[i][j-1] !=-1) {
                b = findMaximum(mat,i,j-1,sum+mat[i][j]);
            }
        }
        if (a == -1 && b == -1) {
            return sum+mat[i][j];
        }
        return Math.max(a, b);
    }
}
