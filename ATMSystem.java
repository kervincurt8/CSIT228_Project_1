import java.util.Scanner;

public class ATMSystem {
    private BankDatabase db = new BankDatabase();
    private ATMScreen screen = new ATMScreen();
    private CashDispenser dispenser = new CashDispenser();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to CodeHub ATM Machine!");

        int attempts = 0;
        User currentUser = null;

        while (attempts < 3) {
            System.out.print("Enter Account Number: ");
            String acc = sc.nextLine();
            System.out.print("Enter Pin: ");
            String pin = sc.nextLine();

            currentUser = db.authenticate(acc, pin);
            if (currentUser != null) break;

            attempts++;
            if (attempts < 3) {
                System.out.println("Wrong Pin or Account Number, try again (" + (3 - attempts) + " attempts left).");
            }
        }

        if (currentUser == null) {
            System.out.println("Too many failed attempts. Program exiting...");
            return;
        }

        boolean running = true;
        while (running) {
            screen.showMenu();
            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                choice = -1;
            }

            if (choice < 1 || choice > 7) {
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                continue;
            }

            ITransaction transaction = null;

            switch (choice) {
                case 1:
                    transaction = new BalanceInquiry(currentUser.getAccount());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmt = Double.parseDouble(sc.nextLine());
                    transaction = new WithdrawalTransaction(currentUser.getAccount(), wAmt);
                    if (currentUser.getAccount().getBalance() >= wAmt)
                        dispenser.dispense(wAmt);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double dAmt = Double.parseDouble(sc.nextLine());
                    transaction = new DepositTransaction(currentUser.getAccount(), dAmt);
                    break;
                case 4:
                    System.out.println("User: " + currentUser.getName());
                    System.out.println("Account Type: " + currentUser.getAccount().getAccountType());
                    break;
                case 5:
                    transaction = new WithdrawalTransaction(currentUser.getAccount(), 500);
                    dispenser.dispense(500);
                    break;
                case 6:
                    Receipt.print("General Inquiry", 0, currentUser.getAccount().getBalance());
                    break;
                case 7:
                    System.out.println("Thank you for using CodeHub ATM. Goodbye!");
                    running = false;
                    break;
            }

            if (transaction != null) transaction.execute();
        }
    }
}
