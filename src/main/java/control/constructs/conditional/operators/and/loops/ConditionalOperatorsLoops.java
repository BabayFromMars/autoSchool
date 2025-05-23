package control.constructs.conditional.operators.and.loops;

import java.util.*;

/*Task 1 Enter two numbers from the keyboard and display the minimum of them.*/
public class ConditionalOperatorsLoops {

    public static void main(String[] args) throws InterruptedException {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() {
        System.out.println("Enter two numbers to compare. First number:");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner1.nextLine());
        System.out.println("Second number:");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = Integer.parseInt(scanner2.nextLine());
        if (number1 > number2) {
            System.out.println("Second number: " + number2 + " is minimal.");
        } else {
            System.out.println("First number: " + number1 + " is minimal.");
        }
    }

    /* Task 2     Input four numbers from the keyboard, and display the maximum of them. */
    public static void task2() {
        int[] array4 = new int[4];
        System.out.println("Enter four numbers to find maximum.");
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < array4.length; i++) {
            System.out.println("Enter number:");
            array4[i] = Integer.parseInt(scanner1.nextLine());
        }
        int max = array4[0];
        for (int i = 1; i < array4.length - 1; i++) {
            if (max < array4[i]) max = array4[i];
        }
        System.out.println("Max number - " + max);

    }

    /* Task 3 Enter three numbers from the keyboard and display them in descending order.*/
    public static void task3() {
        Integer[] array3 = new Integer[3];
        System.out.println("Show me your three numbers.");
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Enter number:");
            array3[i] = Integer.parseInt(scanner1.nextLine());
        }
        Arrays.sort(array3, Collections.reverseOrder());
        System.out.print("Your numbers in descending order: ");
        for (int num : array3) {
            System.out.print(num + " ");
        }

    }

    /* Task 4 Enter two names from the keyboard, and if the names are the same, display the message "The names are identical".
If the names are different but their lengths are equal, display the message "The lengths of the names are equal".*/
    public static void task4() {
        System.out.println("To compare two names, please enter  first name: ");
        Scanner scan1 = new Scanner(System.in);
        String name1 = scan1.nextLine();
        System.out.println("Please enter second name: ");
        String name2 = scan1.nextLine();
        if (name1.equals(name2)) {
            System.out.println("The names are identical.");
        } else if (name1.length() == name2.length()) {
            System.out.println("The lengths of the names are equal.");
        } else {
            System.out.println("The names are different");
        }
    }

    /*Task 5
Enter the name and age from the keyboard. If the age is less than 18, display the message "Grow up more"    */
    public static void task5() {
        System.out.println("Please enter your name: ");
        Scanner scan1 = new Scanner(System.in);
        String name1 = scan1.nextLine();
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scan1.nextLine());
        if (age < 18) {
            System.out.println(name1 + ", grow up more.");
        } else System.out.println("This situation is not covered by task... sorry.");
    }

    /*Task 6 Enter name and age from the keyboard. If the age is more than 20, display the message "18 is enough".*/
    public static void task6() {
        System.out.println("Please enter your name: ");
        Scanner scan1 = new Scanner(System.in);
        String name1 = scan1.nextLine();
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scan1.nextLine());
        if (age > 20) {
            System.out.println(name1 + ", 18 is enough.");
        } else System.out.println("This situation is not covered by task... sorry.");
    }

    /*Task 7 For seven attempts to guess a number. At each attempt you will see a message - "Little" or "Much".
    If you guess within seven attempts, the message "Guessed :)" will be displayed and the program will terminate.
    If after 7 attempts the number is not guessed, the message "Did not guess :(" is displayed and the program terminates.
    You use a code to generate the secret number:
Random random = new Random();
int secret;
// Generate a number from 0 to 20
secret = random.nextInt(20 + 1); */
    public static void task7() {
        Random random = new Random();
        int secret = random.nextInt(20 + 1);
        System.out.println(secret);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Hello stranger, guess the number between 0 to 20. You have 7 attempts. let's start.");
        for (int i = 0; i < 7; i++) {
            System.out.println("Provide your guess:");
            int a = Integer.parseInt(String.valueOf(scan1.nextLine()));
            if (a > secret) {
                System.out.println("Much");
            } else if (a < secret) {
                System.out.println("Little");
            } else {
                System.out.println("Guessed :)");
                break;
            }
        }
        System.out.println("Game over...");
    }

    /*Task 8 Display the numbers from 1 to 10 using a while loop.*/
    public static void task8() {
        int i = 1;
        while (i < 11) {
            System.out.print(i + "; ");
            i++;
        }
    }

    /*Task 9 Display the numbers from 10 to 1 using a while loop.*/
    public static void task9() {
        int i = 10;
        while (i > 0) {
            System.out.print(i + "; ");
            i--;
        }
    }

    /*Task 10 Enter a string and the number N from the keyboard.
    * Print the string N times using a while loop.
Example input:
abc
2
Example output:
abc
abc*/
    public static void task10() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = Integer.parseInt(scan1.nextLine());
        System.out.println("Enter string:");
        String srt1 = scan1.nextLine();
        int a = 0;
        while (a < n) {
            System.out.println(srt1);
            a++;
        }
    }

    /*Task 11 Display a 10x10 square of letters S using a while loop.
    Do not separate letters in each line.*/
    public static void task11() {
        int row = 0;
        while (row < 10) {
            int col = 0;
            while (col < 10) {
                System.out.print("S");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    /* Task 12 Display a 10x10 multiplication table using a while loop.
Separate the numbers with a space.
Example output:
1 2 3 4 5 6 7 8 9 10

2 4 6 8 10 12 14 16 18 20

3 6 9 12 15 18 21 24 27 30    */
    public static void task12() {
        int rows = 1;
        while (rows < 11) {
            int columns = 1;
            while (columns < 11) {
                System.out.print(rows * columns + " ");
                columns++;
            }
            System.out.println();
            rows++;
        }
    }

    /*Task 13
Using the for loop, display even numbers from 1 to 100 inclusive.
Use a space or a new line.*/
    public static void task13() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    /*Task 14
    Enter two numbers m and n from the keyboard.
    Use the for loop to display a rectangle of size m by n made of eights.
    Example: m=2, n=4

    8888

    8888*/
    public static void task14() {
        System.out.println("Enter two numbers to display a rectangle.");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int m = Integer.parseInt(scan1.nextLine());
        System.out.println("Enter second number:");
        int n = Integer.parseInt(scan1.nextLine());
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.println();
            System.out.println();
        }
    }

    /* Task 15
    Using a for loop, display a right triangle of eights with sides 10 and 10.
    Example:

    8

    88

    888

    ...
    */
    public static void task15() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
            System.out.println();
        }
    }

    /*Task 16
Using the for loop, print to the screen:

- horizontal line of 10 eights

- a vertical line of 10 eights.*/
    public static void task16() {
        System.out.println("Horizontal line: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("8");
        }
        System.out.println("\nVertical line: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("8");
        }
    }

    /* Task 17
     Enter a name from the keyboard and, using the for loop 10 times, output: [*name* loves me.]
     Text example:

     Anna loves me.
 …*/
    public static void task17() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter any name:");
        String name = scan1.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }
    }

    /*    Task 18
    Write a program that counts down from 30 to 0, and at the end displays the text "Boom!".
    The program must decrease the number 10 times per second. To insert a delay into the program, use the function:
    Thread.sleep(100); //delay for one tenth of a second.
    Example:

    30

    29

    …

    1

    0

    Boom!
     */
    public static void task18() throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println("\n" + i);
            Thread.sleep(100);
        }
        System.out.println("\nBoom!");
    }
}



