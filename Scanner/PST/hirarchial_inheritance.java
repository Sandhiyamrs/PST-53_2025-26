package PST;

public class hirarchial_inheritance {

	public static void main(String[] args) {
		
		student objB = new student();
		objB.seats();
		objB.subjects();
		
		staff objC = new staff();
		objC.studies();
		
	}
	
	static class classroom {
		void seats() {
			System.out.println("Classroom !!");
		}
	}
	
	static class student extends classroom {
		void subjects() {
			System.out.println("Student !!");
		}
	}
	
	static class staff extends classroom {
		void studies() {
			System.out.println("Staffs !!");
		}
	}
	
}
