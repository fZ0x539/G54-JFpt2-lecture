package se.lexicon;

public class MathOperations {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static long add(long num1, long num2){
        return num1 + num2;
    }

    // varargs: shorthand form of "variable-length arguments".
    // Allows a method to accept a variable number of arguments.
    public static int add(int... numbers){ // 2,5,7,8,9
        int sum = 0;
        for( int num : numbers){
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args){
        System.out.println(add(10.2, 20.5));
    }
}
