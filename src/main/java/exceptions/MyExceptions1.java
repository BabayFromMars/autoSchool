package exceptions;

public class MyExceptions1 {
    public static void sleepingTryCatch() {
        try {
            System.out.println("Засинають автоматизатори...");
            Thread.sleep(3000);
            System.out.println("Прокидаються мануали на чолі з Патілом...");
        } catch (Exception myEx) {
            System.out.println("Всі сплять далі, реліз перенесено...");
        }
    }
}
