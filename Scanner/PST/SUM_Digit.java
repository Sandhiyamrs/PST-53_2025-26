package PST;
import java.util.Scanner;

public class SUM_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sum = 0, num = Math.abs(scanner.nextInt());

        while (num != 0) {
            sum += num % 10; 
            num /= 10;       
        }

        System.out.println("The sum of the digits is: " + sum);
        scanner.close();
    }
    }