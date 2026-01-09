import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	System.out.println("To Check number is positive and even");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a: ");
	int a= sc.nextInt();
	
	if(a>0 && a % 2 ==0) {	
	    System.out.println("The number " + a + " is positive and even");
	} else {
	    System.out.println("The number " + a + " is negative and even");
	}
	    sc.close();
	}
}
