public class Transaction {

    protected double amount;

    public Transaction(double amount){
        this.amount = amount;
    }

    public void process(){
        System.out.println("Transaction amount: " + amount);
    }
}