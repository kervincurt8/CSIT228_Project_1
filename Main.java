
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();

        System.out.print("Enter Initial Deposit: ");
        double balance = sc.nextDouble();

        Account account = null;
        int choice;

        account = new SavingsAccount(accNum, balance);
        account = new CheckingAccount(accNum, balance);

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Savings Account");
            System.out.println("2. Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Transfer Money");
            System.out.println("0. Exit");
            System.out.print("Enter: ");

            choice = sc.nextInt();
            System.out.println("====================");
            switch(choice){

                case 1:
                    account.accountType();
                    break;

                case 2:
                    account.accountType();
                    break;

                case 3:
                    if(account != null){
                        System.out.print("Deposit Amount: ");
                        double dep = sc.nextDouble();

                        Deposit d = new Deposit(dep);
                        d.process();

                        account.deposit(dep);
                    }else{
                        System.out.println("Create an account first.");
                    }
                    break;

                case 4:
                    if(account != null){
                        System.out.print("Withdraw Amount: ");
                        double wit = sc.nextDouble();

                        Withdraw w = new Withdraw(wit);
                        w.process();

                        account.withdraw(wit);
                    }else{
                        System.out.println("Create an account first.");
                    }
                    break;

                case 5:
                    if(account != null){
                        BalanceInquiry b = new BalanceInquiry();
                        b.showBalance(account);
                    }else{
                        System.out.println("Create an account first.");
                    }
                    break;

                case 6:
                    if(account != null){
                        System.out.print("Enter Account to Transfer To: ");
                        int target = sc.nextInt();

                        System.out.print("Amount to Transfer: ");
                        double amount = sc.nextDouble();

                        Transfer t = new Transfer(target, amount);
                        t.processTransfer(account);
                    }else{
                        System.out.println("Create an account first.");
                    }
                    break;

                case 0:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid Option");
            }

        } while(choice != 0);

        sc.close();
    }
}