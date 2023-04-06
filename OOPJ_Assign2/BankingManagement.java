/*
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        int choice;
        do {
            System.out.println("Bank Account Manager");
            System.out.println("--------------------");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Display account balance");
            System.out.println("5. Display account holder's information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter account holder's name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    BankAccount account = new BankAccount(name);
                    accounts.add(account);
                    System.out.println("Account created successfully.");
                    System.out.println("Account number: " + account.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    BankAccount depositAccount = getAccount(accounts, accountNumber);
                    if (depositAccount == null) {
                        System.out.println("Invalid account number.");
                    } else {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        depositAccount.deposit(amount);
                        System.out.println("Amount deposited successfully.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    BankAccount withdrawAccount = getAccount(accounts, withdrawAccountNumber);
                    if (withdrawAccount == null) {
                        System.out.println("Invalid account number.");
                    } else {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        boolean success = withdrawAccount.withdraw(amount);
                        if (success) {
                            System.out.println("Amount withdrawn successfully.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int balanceAccountNumber = scanner.nextInt();
                    BankAccount balanceAccount = getAccount(accounts, balanceAccountNumber);
                    if (balanceAccount == null) {
                        System.out.println("Invalid account number.");
                    } else {
                        System.out.println("Current balance: " + balanceAccount.getBalance());
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    int infoAccountNumber = scanner.nextInt();
                    BankAccount infoAccount = getAccount(accounts, infoAccountNumber);
                    if (infoAccount == null) {
                        System.out.println("Invalid account number.");
                    } else {
                        System.out.println("Account holder's name: " + infoAccount.getAccountHolderName());
                        System.out.println("Current balance: " + infoAccount.getBalance());
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Bank Account Manager!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        } while (choice != 6);
        scanner.close();
    }

    private static BankAccount getAccount(ArrayList<BankAccount> accounts, int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

}

class BankAccount {
    private static int nextAccountNumber = 1000;
    private int accountNumber;
*/

package bank;

public class BankingManagement {
	private String accountHolderName;
	private int accountNumber;
	private double balance;
	public BankingManagement() {
		this.balance=0;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
