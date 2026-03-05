public abstract class Account {

    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount(){
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public abstract void accountType();
}