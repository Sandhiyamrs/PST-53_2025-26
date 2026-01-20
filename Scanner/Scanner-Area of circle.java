import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Area of circle");
		
        float radius;
        final float PI = 3.14159f;
        float area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle (float value): ");

        radius = scanner.nextFloat();

        area = PI * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}
