public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void accountType(){
        System.out.println("Savings Account");
         System.out.println("Balance: " + balance);
    }
}