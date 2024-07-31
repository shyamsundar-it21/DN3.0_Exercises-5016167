package singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger.log("Hi");
        logger.logError("Hi");

        System.out.println("Two object are equal? " + (logger == logger2));
    }
}
