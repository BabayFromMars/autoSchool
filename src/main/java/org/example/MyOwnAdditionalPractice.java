package org.example;
/*
✍️ Завдання:
Створи метод changeNumber(int x) — змінює x на 100
Створи метод changeArray(int[] arr) — змінює перший елемент масиву на 100
Виведи значення x і arr[0] після виклику методів
 */


public class MyOwnAdditionalPractice {
    public static void changeNumber(int x) {
        x = 100;
    }

    public static void changeArray(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int x = 5;
        int[] arr = {1, 2, 3};
        changeArray(arr);
        changeNumber(x);

        System.out.println("x = " + x);
        System.out.println("arr[0] = " + arr[0]);
    }
}
