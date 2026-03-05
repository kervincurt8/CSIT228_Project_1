public class DepositTransaction {
    private BaseAccount account;
    private double amount;

    public DepositTransaction(BaseAccount acc, double amt) {
        this.account = acc;
        this.amount = amt;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("Deposit Successful!");
    }
}   
