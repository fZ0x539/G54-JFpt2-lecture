package se.lexicon;

public class Main {
    public static void main(String[] args) {
        /*System.out.println(MathOperations.add(10,10));
        PaymentProcessor.processPayment("1234-4567-828-81", "321", 20.0);
        PaymentProcessor.processPayment("CreditIsKing", "46",100.0, "SEK");
    */
    BankAccount account1 = new BankAccount();
    account1.accountHolder = "Daniel";
    account1.balance = 100.00;

    BankAccount account2 = new BankAccount();
    account2.accountHolder = "Jafar";
    account2.balance = 20.00;

    account1.displayAccountInfo();
    account2.displayAccountInfo();

    account1.deposit(300.00);
    account1.displayAccountInfo();
    account1.withdraw(300);
    }
}