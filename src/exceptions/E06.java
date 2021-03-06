package exceptions;

import java.util.logging.*;
import java.io.*;

class LoggingException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException1");
    public LoggingException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class LoggingException2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException2");
    public LoggingException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
public class E06 {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (LoggingException1 e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException2();
        } catch (LoggingException2 e) {
            System.err.println("Caught " + e);
        }
    }
}
