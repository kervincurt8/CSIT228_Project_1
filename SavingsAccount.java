public class SavingsAccount extends BaseAccount{
    public SavingsAccount(String accNum, String pin, double bal) {
        super(accNum, pin, bal);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
