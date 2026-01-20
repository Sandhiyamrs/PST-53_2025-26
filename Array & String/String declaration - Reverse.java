public class Main
{
	public static void main(String[] args) {
		System.out.println("String Declaration");
		
		String a = "Sandhiyaaa";
		String b="";
		
		for(int i=0;i<a.length();i++){
		    b=a.charAt(i)+b;
		    
		    System.out.println("Reverse string:"+b);
		}
	}
}
