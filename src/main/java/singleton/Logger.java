package singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;
    private String fileName;

    private Logger() {
        this.fileName = "src\\main\\java\\singleton\\log.txt";
        openFile();
        // Private constructor to prevent instantiation
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    public synchronized void setFileName(String fileName) {
        close(); // Close the old file
        this.fileName = fileName; 
        openFile(); // Reopen with new file name
    }

    public void write(String message) {
        try {
            writer.write(message);
            writer.newLine();
            writer.flush();
            System.out.println("The Logger has logged Message: " + message); // Confirmation message Test in console
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Open the log file for writing 
    public void openFile() {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter(file, true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
