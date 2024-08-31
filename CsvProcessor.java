import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CsvProcessor {

    public static void main(String[] args) {
        String inputFilePath = "C:\\WTest\\X69_test\\Equipment_1-50.csv";
        String outputFilePath = "C:\\WTest\\X69_test\\output.csv";
        String logFilePath = "C:\\WTest\\X69_test\\info.log";

        // Step 1: Write the file
        writeCsvFile(inputFilePath, outputFilePath);

        // Step 2: Read the file and write to .log file with timestamp
        readCsvFileAndWriteLog(outputFilePath, logFilePath);
    }

    // Method to write the CSV file
    public static void writeCsvFile(String inputFilePath, String outputFilePath) {
        Charset inputEncoding = Charset.forName("Shift_JIS"); // Input encoding (Shift-JIS)
        Charset outputEncoding = StandardCharsets.UTF_8; // Output encoding (UTF-8)

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath), inputEncoding));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilePath), outputEncoding))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read the CSV file and write to a log file with timestamp
    public static void readCsvFileAndWriteLog(String csvFilePath, String logFilePath) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:HH:mm:ss.SSS"); // Define the date format

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(csvFilePath), StandardCharsets.UTF_8));
             BufferedWriter logWriter = new BufferedWriter(new FileWriter(logFilePath, true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Get the current timestamp
                String timestamp = dateFormat.format(new Date());

                // Write the timestamp and message to the log file
                logWriter.write(timestamp + " " + line);
                logWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
