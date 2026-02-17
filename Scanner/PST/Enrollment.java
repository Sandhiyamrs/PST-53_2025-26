package PST;

public class Enrollment {
    public static void main(String[] args) {
        University campus = new University();
        campus.showName();

        University.Department course = campus.new Department();
        course.showSubject();
    }
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

