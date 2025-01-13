package se.lexicon;

public class BankAccount {

    static double interestRate = 5.0;
    //Fields
     String accountHolder;
     double balance;

    //Methods
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
            System.out.println("Withdrew " + amount + "SEK");
        }
        else
            System.out.println("Insufficient funds");
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder: " + this.accountHolder + "Account Balance: " + this.balance + " interestRate : " + BankAccount.interestRate);
    }

    public static double calculateLoanPayment(double amount, int years){
        double totalPayment = amount + (amount * (interestRate / 100) * years);
        return totalPayment;
    }
}
