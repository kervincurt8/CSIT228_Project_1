public class CheckingAccount extends Account {

    public CheckingAccount(String accNum, double balance){
        super(accNum, balance);
    }

    @Override
    public void accountType(){
        System.out.println("Checking Account");
       System.out.println("Account History: ");
        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
}