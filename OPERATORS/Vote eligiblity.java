import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Vote eligibility");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		if (age>18){
		    System.out.println("This person is eligible to vote");
		    
		}else{
		    System.out.println("This person is not eligible to vote");
		    
		}
	}
}
