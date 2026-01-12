import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Marks and Grades");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Mark :");
		int num = sc.nextInt();
		
		if(num>=90){
		    System.out.println("Grade = A ");
		}
		else if (num>=75){
		    System.out.println("Grade = B ");
		}
		else if (num>=50){
		    System.out.println("Grade = C ");
		}
		else{
		    System.out.println("FAIL");
		}
	}
}
