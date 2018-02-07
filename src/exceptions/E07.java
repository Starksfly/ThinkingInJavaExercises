package exceptions;

import java.util.logging.*;
import java.io.*;

public class E07 {
    private static Logger logger = Logger.getLogger("LoggingException");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        String[] strings = "Hello the World".split(" ");
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println(strings[i]);

            }

        } catch(ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
