import java.util.Scanner;
class BankManagement{
    String CustomerName;
    static int AccountNumber;
    double balance=10000; 
    Scanner sc = new Scanner (System.in);

    public  void createAccount(){   
        System.out.println("Enter Name");
        this.CustomerName=sc.nextLine();
        System.out.println("Account Created!!!");
        System.out.println("Account Number is:"+(BankManagement.AccountNumber+=1));
    } 
    public  void depositMoney(){
        System.out.println("Enter Account Number");
        BankManagement.AccountNumber=sc.nextInt();
        System.out.println("Enter Deposit Amount:");
        this.balance = this.balance+sc.nextDouble();
        System.out.println("current Balance is:"+this.balance);
    }
    public  void withdrawMoney(){
        System.out.println("Enter Account Number:");
        BankManagement.AccountNumber=sc.nextInt();
        System.out.println("Withdraw Amount:");
        double amountToWithDraw = sc.nextDouble();
        if(amountToWithDraw>this.balance)
        System.out.println("Insufficient Balance:"+ this.balance);
        else{
        this.balance=this.balance-amountToWithDraw;
        System.out.println("Remaining Balance is:"+this.balance);
        }
    } 
    public  void displayBalance(){
        System.out.println("Enter Account Number:");
        BankManagement.AccountNumber=sc.nextInt();
        System.out.println("current balance is:"+ this.balance);
    }
    public  void displayDetails(){
        System.out.println("Enter Account Number:");
        BankManagement.AccountNumber=sc.nextInt();
        System.out.println("Account Details are:");
        System.out.println("Name: "+ this.CustomerName);
        System.out.println("Account Number: "+ BankManagement.AccountNumber);
        System.out.println("Balance: "+ this.balance);
    }
    void displayMenu(){
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Balance");
        System.out.println("5. Display Details");
        System.out.println("0. Exit");
    }
}
class BankManagementSystem {
    public static void main(String [] args){
        BankManagement b = new BankManagement();
        b.displayMenu();
        Scanner sc = new Scanner(System.in);
        int choice=1;
        while((choice = sc.nextInt())!=0){
            b.displayMenu();
            switch(choice){
                case 1: b.createAccount();
                break;
                case 2 : b.depositMoney();
                break;
                case 3 : b.withdrawMoney();
                break;
                case 4 : b.displayBalance();
                break;
                case 5:  b.displayDetails();
                break;
               
            }

        }

    }      
    
}
