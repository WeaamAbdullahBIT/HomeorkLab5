public class CashRegister {
    double price;
    String purchased;
    double total;
    String list = "";


    public void getInfo (String purch, double p) {
        purchased = purch;
        price = p;
        total = total + price;
        list = list + "\n" + purchased.concat(String.valueOf(price));
    }
    public void printReceipt ( ) {
        System.out.println("Purchased Items:");
        System.out.println(list);
        System.out.println("The total amount: " + total);
    }
}
