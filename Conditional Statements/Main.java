import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Number is even or odd ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		if(num%2==0){
		    System.out.println("The number " + num + " is EVEN");
		}
		else {
		    System.out.println("The number  " + num + " is ODD ");
		}
		}
	}
