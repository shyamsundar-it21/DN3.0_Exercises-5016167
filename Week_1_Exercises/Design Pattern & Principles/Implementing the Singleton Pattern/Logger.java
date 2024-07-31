package singleton;

public class Logger {

    private static Logger logger;

    private Logger() {}

    public static synchronized Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null)
                    logger = new Logger();
            }
        }

        return logger;
    }

    public void log(String msg) {
        System.out.println(msg);
    }

    public void logError(String msg) {
        System.err.println(msg);
    }

}
