package logging;

import static logging.Logging.task1Method1;

public class LoggingMain {
    public static void main(String[] args) {
        task1Method1();
    }

    /*Add log4j2 to your project dependencies
Create a logic class with two methods, one is private and the other is public. The public method must call the private method,
both methods must output information about the call to the console.
Create a Main class where the public method from the previous class will be called.

Create in resources/ file log4j2.xml, in which you can configure log output in the form:
yyyy-MM-dd HH:mm:ss <log level> <class name> <class name> <log call string number> <log message> to file log_file.log.
The log should be created in the /target/log-output folder
Add logging to the logic class
Send log_file.log to the curator*/
}
