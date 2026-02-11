package PST;

public class inheritance {

	public static void main(String[] args) {
		
		classroom objA = new classroom();
		objA.seats();
		
		student objB = new student();
		objB.subjects();
		objB.seats();
		
		staff objC = new staff();
		objC.studies();
		objC.subjects();
		objC.seats();
		
	}
	
	static class classroom {
		void seats() {
			System.out.println("The seats are placed in the classroom");
		}
	}
	
	static class student extends classroom {
		void subjects() {
			System.out.println("The students are in the classroom");
		}
	}
	
	static class staff extends student {
		void studies() {
			System.out.println("The staffs are arrived");
		}
	}
	
}
