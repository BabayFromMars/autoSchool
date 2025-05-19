package type.conversion;

public class TypeConversion {
    public static void main(String[] args) {
task1();
task2();
task3();
task4();
    }

    /*1 В переменных q и w хранятся два натуральных числа.
    Создайте программу, выводящую на экран результат деления q на w с остатком.
    Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке*/
    public static void task1() {
        int q = 21;
        int w = 8;
        System.out.println("Завдання 1. Результат ділення із залишком " + q / w + "," + q % w);
        double result = (double) q / w;
        System.out.println("Точне ділення, яке у мене не просили: " + result);
    }
/*2 В переменной n хранится натуральное двузначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

    public static void task2() {
        int n = 21;
        int first = n / 10;
        int second = n % 10;
        System.out.println("Завдання 2. Сума перших двох цифр змінної n: " + (first + second));
    }

    /*3 В переменной m хранится вещественное число с ненулевой дробной частью.
        Создайте программу, округляющую число m до ближайшего целого и выводящую результат на экран.*/
    public static void task3() {
        double m = 3.14;
        long round = Math.round(m);
        System.out.println("Завдання 3. Округлення до найближчого цілого змінної m: " + round);
    }

    /*4 Даны три переменные a, b и c. Изменить значения этих переменных так,
        чтобы в a хранилось значение a+b, в b хранилась разность старых значений c−a, а в c хранилось
        сумма старых значений a+b+c. Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/
    public static void task4() {
        int a = 1;
        int b = 2;
        int c = 3;
        int olda = a;
        int oldc = c;
        c = a + b + c;
        a = a + b;
        b = oldc - olda;
        System.out.println("Завдання 4. Нові значення: a=" + a + ", b=" + b + ", c=" + c + ".");
    }

}

