public class Withdraw extends Transaction {

    public Withdraw(double amount){
        super(amount);
    }

    @Override
    public void process(Account account){

        if(amount <= account.balance){
            account.balance -= amount;   
            System.out.println("Withdraw Transaction: " + amount);
            account.transactionHistory.push("Withdraw: " + amount);
        }else{
            System.out.println("Insufficient Balance");
            account.transactionHistory.push("Failed Withdrawal: " + amount);
        }
    }
}