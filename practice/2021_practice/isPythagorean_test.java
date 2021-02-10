import java.util.Arrays;

public class isPythagorean_test {
    public static void main(String[] args) {
        int arr[] = {3,4,5,949,86,597,678,740,127};
        Arrays.sort(arr);

        System.out.println(isPythagorean(arr));
    }
    public static boolean isPythagorean(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int start = 0, mid = 1, end = arr.length - 1;
        int x = arr[start] * arr[start], y = arr[mid] * arr[mid], z = arr[end] * arr[end];
        if (arr.length == 3) {
            return (x == y + z || y == x + z || z == x + y);
        }
        while (start < end - 1) {
            x = arr[start] * arr[start];
            y = arr[mid] * arr[mid];
            z = arr[end] * arr[end];
            if (x == y + z || y == x + z || z == x + y) {
                System.out.println(Math.sqrt(y)+"+"+Math.sqrt(x)+"="+Math.sqrt(z));
                return true;
            }
            if (start == mid - 1 && mid == end - 1) {
                start++;
                mid = start + 1;
                end = arr.length - 1;
            } else {
                if (mid < end - 1) {
                    mid++;
                } else {
                    mid = start + 1;
                    end--;
                }

            }

        }
        return false;
    }
}
