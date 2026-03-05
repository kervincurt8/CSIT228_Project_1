public class Withdraw extends Transaction {

    public Withdraw(double amount){
        super(amount);
    }

    @Override
    public void process(){
        System.out.println("Withdraw Transaction: " + amount);
    }
}