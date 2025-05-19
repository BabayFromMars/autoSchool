package reference_types.strings;

import java.util.Scanner;

public class Rts {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    /* 1 Дана строка. Вывести первый, последний и средний (если он есть) символы.
Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
Также предусмотрите вывод количества пробелов.*/
    public static void task1() {
        String string = "My mentor is Dmytro Ivanchenko. Hello Java.";
        int length = string.length();
        char first = string.charAt(0);
        char last = string.charAt(string.length() - 1);
        System.out.println("Завдання 1. Перший символ строки: " + first);
        System.out.println("Останній символ строки: " + last);
        if (length % 2 != 0) {
            int middleIndex = string.length() / 2;
            char middle = string.charAt(middleIndex);
            System.out.println("Середній символ строки: " + middle);
        } else System.out.println("Середній символ строки відсутній.");
        int index = string.indexOf(".");
        String part = string.substring(0, index + 1);
        System.out.println("Частина строки до крапки: " + part);
        int count = 0;
        char target = ' ';
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Кількість пробілів в строці: " + count);
    }

    /*2 Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.*/
    public static void task2() {
        String string1 = "I just started learning Java. Hello Java. Hello Dmytro!";
        System.out.println(" Завдання 2. Яку частину строки знайти?");
        Scanner scanner1 = new Scanner(System.in);
        String pidstroka1 = scanner1.nextLine();
        System.out.println("На що замінити її?");
        Scanner scanner2 = new Scanner(System.in);
        String pidstroka2 = scanner2.nextLine();
        if (string1.contains(pidstroka1)) {
            String newString = string1.replace(pidstroka1, pidstroka2);
            System.out.println(newString);
        } else {
            System.out.println("В строці нема частіни, яку ви ввели");
        }
    }

    /*3 Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.*/
    public static void task3() {
        System.out.println(" Завдання 3. Введіть строку з кількома словами, пробілами.");
        Scanner scanner3 = new Scanner(System.in);
        String pidstroka3 = scanner3.nextLine();
        String[] array1 = pidstroka3.split(" ");
        int maxwordlength = 0;
        String thelongestword = " ";
        for (int i = 0; i < array1.length; i++) {
            if (maxwordlength < array1[i].length()) ;
            maxwordlength = array1[i].length();
            thelongestword = array1[i];
        }
        System.out.println("Найдовше слово: " + thelongestword + ". В ньому " + maxwordlength + " символів.");
    }

}
