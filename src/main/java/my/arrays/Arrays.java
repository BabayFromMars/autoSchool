package my.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /*-1-    Максимальное среди массива на 20 чисел
    1. В методе initializeArray():
    1.1. Создайте массив на 20 чисел
    1.2. Считайте с консоли 20 чисел и заполните ими массив
    2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
    public static void task1() {
        initializeArray();
    }

    public static void initializeArray() {
        System.out.println("Завдання 1. Давайте створимо масив на 20 чисел");

        int[] array20 = new int[20];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Введіть число:");
            int element = Integer.parseInt(scanner1.nextLine());
            array20[i] = element;
        }
        System.out.print("Введений масив: [ ");
        for (int i = 0; i < 20; i++) {
            System.out.print(array20[i] + " ");
        }
        max(array20);
    }

    public static void max(int[] array) {
        int max20 = 0;
        for (int i = 0; i < array.length; i++) {
            if (max20 < array[i]) {
                max20 = array[i];
            }
        }
        System.out.println("]. Максимальне значення в масиві - " + max20);
    }

    /*-2-    Массив из строчек в обратном порядке
    1. Создать массив на 10 строчек.
    2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
    3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/
    public static void task2() {
        String[] array10 = new String[10];
        System.out.print("Завдання 2. Давайте створимо масив на 10 записів. Але запишемо 8...");
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Введіть число:");
            String element1 = scanner2.nextLine();
            array10[i] = element1;
        }
        for (int i = array10.length - 1; i >= 0; i--)
            System.out.println("Наш масив: " + array10[i]);
    }

    /*-3-            2 массива
    1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
    public static void task3() {
        String[] array10new = new String[10];
        int[] array10newb = new int[10];
        System.out.print("Завдання 3. Давайте створимо масив на 10 записів.");
        Scanner scanner3 = new Scanner(System.in);
        for (int i = 0; i < array10new.length; i++) {
            System.out.println(" Введіть текст:");
            String element3 = scanner3.nextLine();
            array10new[i] = element3;
            array10newb[i] = element3.length();
        }
        System.out.print("Введений масив слів: ");
        for (int i = 0; i < array10new.length; i++) {
            System.out.print(array10new[i] + " ");
        }
        System.out.println("Масив з довжиною слів: ");
        for (int i = 0; i < array10newb.length; i++) {
            System.out.println(array10newb[i] + ";");
        }
    }

    /*-4-    Массив из чисел в обратном порядке
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Расположить элементы массива в обратном порядке.
    4. Вывести результат на экран, каждое значение выводить с новой строки.*/
    public static void task4() {
        int[] array10task4 = new int[10];
        System.out.println("Завдання 4. Давайте створимо масив на 10 записів. ");
        Scanner scanner5 = new Scanner(System.in);
        for (int i = 0; i < array10task4.length; i++) {
            System.out.println("Введіть число:");
            array10task4[i] = Integer.parseInt(scanner5.nextLine());
        }
        for (int i = 0; i < array10task4.length / 2; i++) {
            int temp = array10task4[i];
            array10task4[i] = array10task4[array10task4.length - 1 - i];
            array10task4[array10task4.length - 1 - i] = temp;
        }
        System.out.println("Масив: ");
        for (int j = 0; j < array10task4.length; j++) {
            System.out.println(array10task4[j] + ";");
        }
    }

    /*-5-
    Один большой массив и два маленьких
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
    public static void task5() {
        int[] array20task5 = new int[20];
        int[] array10atask5 = new int[10];
        int[] array10btask5 = new int[10];
        System.out.println("Завдання 5. Давайте створимо масив на 20 записів. ");
        Scanner scanner6 = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("Введіть число:");
            array20task5[i] = Integer.parseInt(scanner6.nextLine());
            if (i < array20task5.length / 2) array10atask5[i] = array20task5[i];
            else array10btask5[i - 10] = array20task5[i];
        }
        System.out.println("Масив 2: ");
        for (int l = 0; l < 10; l++) {
            System.out.println(array10btask5[l] + ";");
        }
    }
}

