package org.example;
import java.util.Scanner;
import com.welcome.Hello;

public class PrimitiveTypes2_AdditionTaskAboutMain2 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Як тебе звати? ");
        String userName = scanner1.nextLine();
        Hello hello = new Hello();
        hello.setupName(userName);
        hello.welcome();

        System.out.println("Hello, world!");

        hello.byeBay();

    }
}

