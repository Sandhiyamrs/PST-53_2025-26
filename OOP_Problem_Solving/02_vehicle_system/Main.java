public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Yamaha");
        v1.startEngine();
        v2.startEngine();
    }
}