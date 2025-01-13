package se.lexicon;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathOperations.add(10,10));
        PaymentProcessor.processPayment("1234-4567-828-81", "321", 20.0);
        PaymentProcessor.processPayment("CreditIsKing", "46",100.0, "SEK");
    }
}