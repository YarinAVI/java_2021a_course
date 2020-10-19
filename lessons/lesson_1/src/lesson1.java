import java.util.Scanner;
public class lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(  ( ((num/1000)%10) + (num/100) %10) +((num/10) %10) + (num%10)  );
        System.out.println(num % 1000);
        System.out.print( num/1000%10 +""+ num%10 );
    }
}
