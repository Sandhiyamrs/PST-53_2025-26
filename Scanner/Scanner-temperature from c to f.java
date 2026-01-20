import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Temperature conversion");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Temperature in celsius");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
		
		scanner.close();
	}
}
