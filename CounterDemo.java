public class CounterDemo {
    public static void main(String[] args) {
        Counter tally = new Counter();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        tally.click();
        int result = tally.getValue();
        System.out.println("results: " + result);
    }
}
