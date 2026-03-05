import java.util.Stack;
public abstract class Account {

    protected Stack<String> transactionHistory = new Stack<>();
    protected String accountNumber;
    protected double balance;

    public Account(String accNum, double balance){
        this.accountNumber = accNum;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        transactionHistory.push("Deposit: " + amount);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            transactionHistory.push("Withdrawal: " + amount);
        }else{
            transactionHistory.push("Failed Withdrawal: " + amount);
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount(){
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void showTransactionHistory(){

    System.out.println("Transaction History:");

    if(transactionHistory.isEmpty()){
        System.out.println("No transactions yet.");
    }else{
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
}
    public abstract void accountType();
}