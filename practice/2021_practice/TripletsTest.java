import java.util.Arrays;

public class TripletsTest {
    public static void main(String[] args) {
        //670,258,241,796,364,268,20,109,823,787,786,529,314,377,178,501,196,856,640,363,728,521,187,76,594,102,597,589,697,748,246,346,707,305,816
        int arr[] = {670,258,241,796,364,268,20,109,823,787,786};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        printTrip(arr,41659260);
    }
    public static void printTrip(int []arr,int num)
    {
        int low =0;
        int high = arr . length -1;
        int second = low +1;

        while (second < high) {
            if (arr[low] * arr[second] * arr[high] < num) {
                second++;
            } else if (arr[low] * arr[second] * arr[high] > num) {
                high--;
            } else {
                System.out.println(arr[low] + " " + arr[second] + " " + arr[high]);
                low++;
                second = low + 1;
            }

        }

    }
}
