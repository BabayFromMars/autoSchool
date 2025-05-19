package org.example;
import java.util.Scanner;
/*
Создать простой Java-проект (консольное приложение), которое при запуске выводит в консоль “Hello, world!”.
Добавить метод printHelloName(), который будет запрашивать у пользователя ввести имя,
считывать введенное имя с консоли и выводить на экран приветствие “Hello, %name%”.

Дополнительное задание (для тех, кому основное будет очень легким:-)
Создать еще один класс Main2 с методом main(String[] args), который при запуске выводит в консоль “Hello, world!”.
Создать отдельный пакет ‘com.welcome’. В нем создать класс Hello, туда добавить методы:
setupName(String name) - присваивает внутренней private переменной имя человека,
welcome() - формирует и выводит в консоль приветствие "Hello, %name%" (имя должно подставляться),
byeBay() - прощается с выводом в консоль фразы "Bye, %name%"
В Main2 классе подключить этот пакет, и вначале программы запросить имя человека, присвоить его переменной класса Hello,
потом поприветствовать его, в конце - попрощаться перед закрытием программы. Между ‘hello’ и ‘bye’ будет ваше “Hello, world!”.
 */
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
