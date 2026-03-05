public class Deposit extends Transaction {

    public Deposit(double amount){
        super(amount);
    }

    @Override
    public void process(){
        System.out.println("Deposit Transaction: " + amount);
    }
}