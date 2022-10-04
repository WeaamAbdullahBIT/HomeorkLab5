public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount CheCKing=new BankAccount();
        BankAccount momsSavings = new BankAccount(1000);
        momsSavings.addInterest(10);
        CheCKing.deposit(1000);
        CheCKing.withdraw(500);
        CheCKing.withdraw(400);
        System.out.println(CheCKing.getBalance());
        System.out.println("Expected : 100");
    }

}
