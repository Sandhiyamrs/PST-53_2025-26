public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("S101", 10000);
        BankAccount acc2 = new CurrentAccount("C201", 15000);
        System.out.println(acc1.calculateInterest());
        System.out.println(acc2.calculateInterest());
    }
}