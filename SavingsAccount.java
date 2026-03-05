public class SavingsAccount extends Account {

    public SavingsAccount(String accNum, double balance){
        super(accNum, balance);
    }

    @Override
    public void accountType(){
        System.out.println("Savings Account");
         System.out.println("Balance: " + this.balance);
    }
}