public class BalanceInquiry implements ITransaction{
     private BaseAccount account;

    public BalanceInquiry(BaseAccount acc) {
        this.account = acc;
    }

    @Override
    public void execute() {
        System.out.printf("Your current %s balance is: $%.2f%n",
                          account.getAccountType(), account.getBalance());
    }
}
