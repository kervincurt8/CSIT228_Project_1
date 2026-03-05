public class Loan {

    private double loanAmount;

    public Loan(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public void showLoan(){
        System.out.println("Loan Amount: " + loanAmount);
    }
}