package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamApi {
    public static void main(String[] args) {
        task();
    }

    /*Task 1
    Create a List<String> list not shorter than 50 elements of different length (filling is not important).
    Add manually some empty elements ""
    Output to the console using stream():
    the length of each of the list elements.
    non-empty list items not containing the d character
    list items in alphabetical order.*/
    public static void task() {
        List<String> myList = new ArrayList<>(50);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        for (int i = 0; i < 47; i++) {
            int wordLength = random.nextInt(7) + 3;
            String randomeString = "";
            for (int j = 0; j < wordLength; j++) {
                int index = random.nextInt(alphabet.length());
                randomeString += alphabet.charAt(index);
            }
            myList.add(randomeString);
        }
        myList.add("");
        myList.add("");
        myList.add("");
        System.out.println("Розмір списку: " + myList.size());
        System.out.println("Cписок: " + myList);
        System.out.print("Довжина слів в списку: ");
        myList.stream()
                .map(String::length)
                .forEach(len -> System.out.print(len + "; "));
        System.out.println("\nНе пусті записи, які маюсть d в складі: ");
        myList.stream()
                .filter(d -> d.contains("d"))
                .forEach(d -> System.out.print(d + "; "));
        System.out.println("\nСписок в алфавітному порядку: ");
        myList.stream()
                .filter(alf -> !alf.isEmpty())
                .sorted()
                .forEach(alf -> System.out.print(alf + "; "));
    }
}
