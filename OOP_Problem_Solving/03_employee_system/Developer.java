class Developer extends Employee {
    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 3000;
    }
}