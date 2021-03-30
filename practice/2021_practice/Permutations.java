public class Permutations {
    // Function to print all the permutations of str
    static int printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            if (ans.contains("123") || ans.contains("321") || ans.contains("234") || ans.contains("345") || ans.contains("456") || ans.contains("654") || ans.contains("543") || ans.contains("432") || ans.contains("321")) {
                return 0;
            }
            System.out.println(ans);
            return 1;
        }
        int res = 0;
        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            // Recurvise call
            res += printPermutn(ros, ans + ch);
        }
        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "123456";
        System.out.println(printPermutn(s, ""));
    }
}
