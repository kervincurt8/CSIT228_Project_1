public class Deposit extends Transaction {

    public Deposit(double amount){
        super(amount);
    }

    @Override
    public void process(Account account){
        account.balance += amount;
        System.out.println("Deposit Transaction: " + amount);
        account.transactionHistory.push("Deposit: " + amount);
    }
}