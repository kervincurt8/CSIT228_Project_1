
public class User {
    private String name;
    private BaseAccount account;

    public User(String name, BaseAccount account) {
        this.name = name;
        this.account = account;
    }

    public String getName() { return name; }
    public BaseAccount getAccount() { return account; }
}