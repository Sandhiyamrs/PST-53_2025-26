class Bike extends Vehicle {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started");
    }
}