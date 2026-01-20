import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Check the number");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");

        if (scanner.hasNextDouble()) {
            
            double number = scanner.nextDouble();

            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.out.println("Invalid input. Please enter a numerical value.");
        }

        scanner.close();
	}
}
