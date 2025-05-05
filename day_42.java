package code_challenges_100_days;

//Create a bankAccount class with methods to deposit and withdraw money.
public class day_42 {
    private String accountholder;
    private double balance;
//    constructor
    public void BankAccount(String accountholder, double initialBalance){
        this.accountholder=accountholder;
        this.balance = initialBalance;
    }
//    method to deposit money
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited: "+ amount);
        }else {
            System.out.println("Invalid deposit amount");
        }
    }
//    method to withdraw money
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        }else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
//method to check balance
    public void displaybalance(){
        System.out.println("current balance: "+balance);
    }
//    main method for testing
    public static void main(String[] args) {
        day_42 object = new day_42();
        object.displaybalance();
        object.deposit(20000);
        object.displaybalance();
        object.withdraw(3452);
        object.displaybalance();
        object.withdraw(2000); //example of insufficient funds
    }
}