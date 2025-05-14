package org.example;
import java.util.Scanner;

public class PrimitiveTypes {
     public static void main(String[] args) {
         System.out.println("Hello world!");
         printHelloName();
}
    public static void printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишіть своє ім'я.");
        String name = scanner.nextLine();
        System.out.println("Привіт, " + name + "!");
    }
}
