public class Main {
    public static void main(String[] args) {

        // Banking
        BankAccount acc = new SavingsAccount("S101", 10000);
        System.out.println("Interest: " + acc.calculateInterest());

        // Vehicle
        Vehicle v = new Car("Toyota");
        v.startEngine();

        // Shape
        Shape s = new Circle(5);
        System.out.println("Area: " + s.calculateArea());
    }
}