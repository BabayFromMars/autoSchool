package exceptions;

public class MyExceptions2 {
    public void sleepingThrows() throws InterruptedException {
        System.out.println("Засинають бізнес аналітики...");
        Thread.sleep(3000);
        System.out.println("Але Віталік не спить...");
    }
}
