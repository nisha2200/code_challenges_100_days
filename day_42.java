//package code_challenges_100_days;
//
////Create a bankAccount class with methods to deposit and withdraw money.
//public class day_42 {
//    public class BankAccount {
//        private String accountHolder;
//        private double balance;
//
//        //        constructor
//        public BankAccount(String accountHolder, double initialbalance) {
//            this.accountHolder = accountHolder;
//            this.balance = initialbalance;
//        }
//
//        //        deposit method
//        public void deposit(double amount) {
//            if (amount > 0) {
//                balance += amount;
//                System.out.println("Deposited: $" + amount);
//            } else {
//                System.out.println("Deposit amount must be positive.");
//            }
//        }
//
//        //        Withdraw method
//        public void withdraw(double amount) {
//            if (amount > 0 && amount <= balance) {
//                balance = amount;
//                System.out.println("Withdrawn: $ " + amount);
//            } else {
//                System.out.println("Invalid withdrawal amount or insufficient balance.");
//            }
//        }
//
//        //        method to display account info
//        public void displayAccount() {
//            System.out.println("acount holder: " + accountHolder);
//            System.out.println("Balance: $ " + balance);
//        }
//
//        public void main(String[] args) {
//            BankAccount object = new BankAccount("Poonam", 12200);
//            object.deposit(58000);
//            object.withdraw(23456);
//            object.displayAccount();
//        }
//    }
//}
//}