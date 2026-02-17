package PST;

class Sandy {

}
class University {
    public void showName() {
        System.out.println("A Girl");
}

    class Department {
        public void showSubject() {
            System.out.println("java");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        University campus = new University();
        campus.showName();

        University.Department course = campus.new Department();
        course.showSubject();
    }
}

