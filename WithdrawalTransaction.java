
public class WithdrawalTransaction implements ITransaction {
    private BaseAccount account;
    private double amount;

    public WithdrawalTransaction(BaseAccount acc, double amt) {
        this.account = acc;
        this.amount = amt;
    }

    @Override
    public void execute() {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal Successful! Please collect your cash.");
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }
}