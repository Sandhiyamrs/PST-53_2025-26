package PST;
import java.util.Scanner;

public class SUM_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = 0, n = Math.abs(scanner.nextInt());

        while (n != 0) {
            sum += n % 10; 
            n /= 10;       
        }

        System.out.println("The sum of the digits is: " + sum);
        scanner.close();
    }
}
