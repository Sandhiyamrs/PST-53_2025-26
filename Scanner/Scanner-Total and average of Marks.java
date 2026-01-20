import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Marks-Total and average");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the marks of three subjects ");
		
		System.out.print("Mark 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Mark 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Mark 3: ");
        int mark3 = scanner.nextInt();
        
        scanner.close();
        
        int totalMarks = mark1+mark2+mark3;
        double averageMarks = (double) totalMarks/3;
        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        
	}
}
