package com.algonquin.cst8288.assignment2.logger;

public class LMSLogger {

    private static LMSLogger instance;
    private LogLevel logLevel;

    // Private constructor to prevent instantiation from outside
    private LMSLogger() {
        // Default log level
        logLevel = LogLevel.INFO;
    }

    // Method to get the singleton instance
    public static synchronized LMSLogger getInstance() {
        if (instance == null) {
            instance = new LMSLogger();
        }
        return instance;
    }

    // Method to set the log level
    public void setLogLevel(LogLevel level) {
        this.logLevel = level;
    }

    // Method to log messages
    public void log(LogLevel level, String message) {
        if (level.level >= logLevel.level) {
            System.out.println("[" + level.name() + "] " + message);
        }
    }

    // Method to log exceptions
    public void logException(LogLevel level, String message, Throwable throwable) {
        if (level.level >= logLevel.level) {
            System.out.println("[" + level.name() + "] " + message);
            throwable.printStackTrace();
        }
    }

}

