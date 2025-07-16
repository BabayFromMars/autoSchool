package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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
        List<Integer> lengths = new ArrayList<>();
        List<String> wordsWithoutD = new ArrayList<>();
        List<String> sortedList = myList.stream()
                .peek(word -> lengths.add(word.length()))
                .filter(word -> !word.isEmpty())
                .peek(word -> {
                    if (!word.contains("d")) wordsWithoutD.add(word);
                })
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Довжина слів в списку: " + lengths);
        System.out.println("Не пусті записи, які не мають 'd': " + wordsWithoutD);
        System.out.println("Список в алфавітному порядку: " + sortedList);
    }
}