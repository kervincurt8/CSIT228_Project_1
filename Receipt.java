public class Receipt {
    public static void print(String transactionType, double amount, double balance) {
        System.out.println("---------- RECEIPT ----------");
        System.out.println("Transaction: " + transactionType);
        if (amount > 0) System.out.printf("Amount: $%.2f%n", amount);
        System.out.printf("Remaining Balance: $%.2f%n", balance);
        System.out.println("-----------------------------");
    }
}
