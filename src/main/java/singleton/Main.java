package singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setFileName("src\\main\\java\\singleton\\new_log.txt"); // Set custom log file path if needed 
        logger.write("Simulation started");
        logger.write("Processing data...");
        logger.write("Simulation finished");
        logger.close(); // Close the logger
    }
}
