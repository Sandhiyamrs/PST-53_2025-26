import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("pass mark");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter mark: ");
		int mark = sc.nextInt();
		
		System.out.println("Enter grace : ");
		int grace = sc.nextInt();
		
		if(mark>=40 || grace==2){
		    System.out.println("The student is passed");
		}
		else {
		    System.out.println("The Student is failed");
		}
		sc.close();
		}
	}
