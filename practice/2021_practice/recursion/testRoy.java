package recursion;

public class testRoy {
    public static void findWord(char[][] arr, String word) {
        if (!findWord(arr, word, new int[arr.length][arr[0].length], 0, 0, 0))
            System.out.println("No Such Word");
    }

    private static boolean findWord(char[][] arr, String word, int[][] mat, int i, int j, int howMany) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 'A')
            return false;
        if (word.length() == 1 && word.charAt(0) == arr[i][j]) {
            howMany++;
            mat[i][j] = howMany;
            printArr(mat);
            return true;
        }
        else if (arr[i][j] == word.charAt(0)) {
            howMany++;
            mat[i][j] = howMany;
            char temp2 = arr[i][j];
            arr[i][j] = 'A';
            boolean way1 = findWord(arr, subString(word, 1), mat, i + 1, j, howMany);
            boolean way2 = findWord(arr, subString(word, 1), mat, i - 1, j, howMany);
            boolean way3 = findWord(arr, subString(word, 1), mat, i, j + 1, howMany);
            boolean way4 = findWord(arr, subString(word, 1), mat, i, j - 1, howMany);
            arr[i][j] = temp2;
            return way1 || way2 || way3 || way4;
        }
        boolean way1 = findWord(arr, word, mat, i + 1, j, 0);
        boolean way2 = findWord(arr, word, mat, i - 1, j, 0);
        boolean way3 = findWord(arr, word, mat, i, j + 1, 0);
        boolean way4 = findWord(arr, word, mat, i, j - 1, 0);

        return way1 || way2 || way3 || way4;



    }
    private static void printArr(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print("" + mat[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static String subString(String x, int i) {
        return subString(x, i, i, "");
    }
    private static String subString(String x, int index, int i, String res) {
        if (res.length() == x.length() - i)
            return res;
        res += x.charAt(index);
        return subString(x, index + 1, i, res);
    }
}
