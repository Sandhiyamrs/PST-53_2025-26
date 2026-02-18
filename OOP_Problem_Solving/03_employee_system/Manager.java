class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 5000;
    }
}