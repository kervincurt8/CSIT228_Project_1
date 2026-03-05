public class Transfer {

    private int targetAccount;
    private double amount;

    public Transfer(int targetAccount, double amount){
        this.targetAccount = targetAccount;
        this.amount = amount;
    }

    public void processTransfer(Account account){

        if(amount <= account.balance){
            account.balance -= amount;

            System.out.println("Transferred: " + amount);
            System.out.println("To Account: " + targetAccount);
        }else{
            System.out.println("Transfer Failed: Insufficient Balance");
        }
    }
}