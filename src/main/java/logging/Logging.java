package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {

    private static final Logger myLogs = LogManager.getLogger(Logging.class);

    public static void task1Method1() {
        task1Method2();
        myLogs.info("Метод task1Method1 був викликаний");
    }

    private static void task1Method2() {
        myLogs.info("Метод task1Method2 був викликаний");
    }
}

