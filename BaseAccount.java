public abstract class BaseAccount {
    private String accountNumber;
    private String pin;
    protected double balance;

    public BaseAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public boolean validatePin(String inputPin) { return this.pin.equals(inputPin); }
    public double getBalance() { return balance; }

    public abstract String getAccountType();

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
