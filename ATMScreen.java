public class ATMScreen {
    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void showMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. View Account Info");
        System.out.println("5. Fast Cash ($500)");
        System.out.println("6. Print Last Receipt");
        System.out.println("7. Exit");
        System.out.print("Enter (1-7): ");
    }
}
