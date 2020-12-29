// By yarin avisidris
import java.util.Scanner;
public class print_level {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of elements");
        int n = scan.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Now enter "+n+" Elements");
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
            if(a[i]>max) max = a[i];
        }

        for(int current_level = max;current_level>0;current_level--) {
            for(int i=0;i<a.length;i++) {
                if(a[i]>=current_level) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++) {
            System.out.print("--");
        }
        System.out.println();
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}