public class BankAccount {

    double balance = 0;

 public  BankAccount(double initalBalance){
     balance=initalBalance;
 }

    public BankAccount() {

    }

    public void deposit(double amount) {
       double newBalance=balance+amount;
       balance=newBalance;
    }
    public void withdraw(double amount){
     double newBalance = balance-amount;
     balance=newBalance;
    }
    public  double getBalance(){
     return balance;
    }
    public void addInterest(double rate)
    {

    }


}

