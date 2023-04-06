import java.util.Scanner;

public class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory) {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean isPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public int calculateCreditScore() {
        int creditScore;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        return creditScore;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of your credit history (in years): ");
        int creditHistory = input.nextInt();

        System.out.print("Enter your credit utilization (as a percentage): ");
        double creditUtilization = input.nextDouble() / 100.0;

        System.out.print("Do you have a good payment history? (true/false): ");
        boolean paymentHistory = input.nextBoolean();

        CreditScoreCalculator calculator = new CreditScoreCalculator(creditHistory, creditUtilization, paymentHistory);
        int creditScore = calculator.calculateCreditScore();
        System.out.println("Your credit score is: " + creditScore);
    }
}
