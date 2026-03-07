
public class CheckingAccount extends BaseAccount {
    public CheckingAccount(String accNum, String pin, double bal) {
        super(accNum, pin, bal);
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}