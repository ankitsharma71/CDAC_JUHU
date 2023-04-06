import java.util.Scanner;

public class TelephoneBill {
    private String customerName;
    private String phoneNumber;
    private int numCalls;
    private int callDuration;
    private double billAmount;

    public TelephoneBill(String customerName, String phoneNumber, int numCalls, int callDuration) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.numCalls = numCalls;
        this.callDuration = callDuration;
    }

    public void calculateBill() {
        int numFirst100Calls = Math.min(numCalls, 100);
        int numRemainingCalls = numCalls - numFirst100Calls;

        double first100CallsCharge = numFirst100Calls * 0.5;
        double remainingCallsCharge = numRemainingCalls * 0.25;
        double durationCharge = Math.ceil(callDuration / 60.0) * 0.2;

        billAmount = first100CallsCharge + remainingCallsCharge + durationCharge + 10;
    }

    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Number of Calls: " + numCalls);
        System.out.println("Call Duration (in minutes): " + callDuration);
        System.out.printf("Bill Amount: $%.2f\n", billAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter number of calls made: ");
        int numCalls = scanner.nextInt();
        System.out.print("Enter total duration of calls (in minutes): ");
        int callDuration = scanner.nextInt();

        TelephoneBill bill = new TelephoneBill(customerName, phoneNumber, numCalls, callDuration);
        bill.calculateBill();
        bill.displayBill();
    }
}

