//Mark-Agad was here

import java.util.ArrayList;

public class BankDatabase {
    private ArrayList<User> users = new ArrayList<>();

    public BankDatabase() {
        users.add(new User("Juan Dela Cruz", new SavingsAccount("123456", "1111", 5000.0)));
        users.add(new User("Maria Clara", new CheckingAccount("654321", "2222", 10000.0)));
        users.add(new User("CodeHub Student", new SavingsAccount("000000", "1234", 100.0)));
    }

    public User authenticate(String accNum, String pin) {
        for (User u : users) {
            if (u.getAccount().getAccountNumber().equals(accNum) &&
                u.getAccount().validatePin(pin)) {
                return u;
            }
        }
        return null;
    }
}