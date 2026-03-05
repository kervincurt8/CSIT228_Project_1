public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void accountType(){
        System.out.println("Checking Account");
       System.out.println("Account Histyory: ");
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
}