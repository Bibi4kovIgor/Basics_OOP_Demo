package edu.lemon.program;

public interface Printable {
    void print();

    default void print(String description, Object object) {
        System.out.printf("%s of %s", description, object);
    }

    String additionalPrintInfo = "\nYou launch Printable interface";
    static void printAdditionalInfo(){
        System.out.println(additionalPrintInfo);
    }
}
