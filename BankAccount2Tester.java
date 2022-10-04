public class BankAccount2Tester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(10);
        b.deposit(5000);
        b.withdraw(b.getBalance() / 2);
    }
}
