package recursion;

public class minPointsTest {
    public static void main(String[] args) {
        int[][] mat1 = {{-1000, -1000, -1000, -1000, 10},
                {-1000, -1000, -1000, -1000, -1000},
                {-1000, -1000, -1000, -1000, -1000},
                {-1000, -1000, -1000, -1000, -1000},
                {-1000, -1000, -1000, -1000, -1000},
        };
        System.out.println(minPoints(mat1));
    }

    public static int minPoints(int[][] m) {
        return Math.min(minPoints(m, 1, 0, -m[0][0], 0), minPoints(m, 0, 1, -m[0][0], 0));
    }

    private static int minPoints(int[][] m, int i, int j, int sum, int min) {
        if (i == m.length || j == m[i].length) {
            return Integer.MAX_VALUE;

        }
        sum -= m[i][j];
        if (sum > min) {
            min = sum;
        }
        if (i == m.length - 1 && j == m[i].length - 1) {
            if (min < 0) {
                return 1;

            }
            return min + 1;
        }
        int path1 = minPoints(m, i, j + 1, sum, min);
        int path2 = minPoints(m, i + 1, j, sum, min);
        return Math.min(path1, path2);
    }
}
