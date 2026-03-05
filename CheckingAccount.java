public class CheckingAccount extends Account {

    public CheckingAccount(int accountNumber, double balance){
        super(accountNumber, balance);
    }

    @Override
    public void accountType(){
        System.out.println("Checking Account");
       
    }
}