package se.lexicon;

public class StringExamples {

    public static void main(String[] args) {
        String greeting = "Hello";

        greeting = greeting.concat(" World");

        String str = "Hello, World!";
        System.out.println("Length: " + (str.length()));
        System.out.println("Character at index 2: " + str.charAt(2));
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i)); // returns the character at the specified index (0-based index)
        }

        ex2();
    }

    public static void ex1(){
        String string = "Hello Strings";
        int index1 = string.indexOf("llo"); //Returns the index of the first or last occurrence of a specified substring
        System.out.println("index1 = " + index1);
        int index2 = string.indexOf("H"); // 2
        System.out.println("Index2 = " + index2);
        int index3 = string.indexOf("Hell", 2); // -1 (not found)
        System.out.println("index3 = " + index3);
    }

    public static void ex2(){
        String str1 = "java";
        String str2 = "Java";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
