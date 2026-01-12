import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Number is greater than than 100 or not");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Nmber : ");
		int num = sc.nextInt();
		
		if(num>100){
		    System.out.println("The given number  " + num + " is gretaer than 100 ");
		}
		else {
		    System.out.println("The given number  " + num + " is lesser than 100 ");
		}
		}
		
	}