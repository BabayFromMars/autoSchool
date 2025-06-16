package exceptions;

/*Create two classes.
Implement the next code inside them:
Thread.sleep(); with parameter of 3 seconds
in two different ways

via try/catch
specify the type of generated exception when declaring the method
  2. Create class Main.

In any place of the code, insert the following line

int zero = 5/0;
When executing this code in the console, we will get an exception java.lang.ArithmeticException

Use try/catch to catch the generated exception and replace it with the text You shall not fall!*/
public class ExceptionsMain {
    public static void main(String[] args) throws InterruptedException {
        task1();
    }

    public static void task1() throws InterruptedException {
        MyExceptions1 ex1 = new MyExceptions1(); //не виагалося в завданні, але навіщо ми тоді писали
        MyExceptions1.sleepingTryCatch();

        MyExceptions2 ex2 = new MyExceptions2(); //не виагалося в завданні, але навіщо ми тоді писали
        ex2.sleepingThrows();

        try {
            int zero = 5 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("You shall not fall!");
        }
    }
}

