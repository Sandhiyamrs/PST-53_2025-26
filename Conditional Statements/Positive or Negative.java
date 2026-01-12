import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("The number is positive or negative");
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the Number : ");
	    int num = sc.nextInt();
	    
	    if(num>=0){
	        System.out.println("The number is positive");
	    }
	    else { 
	        System.out.println("The number is negative");
	    }
	    }
}
