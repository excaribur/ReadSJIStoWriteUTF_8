# ReadSJIStoWriteUTF_8

# CSV to Log File Processor

## Overview

This Java project reads a CSV file encoded with Shift-JIS, writes it to a new CSV file with UTF-8 encoding, and then logs each line from the new CSV file to a `.log` file with a timestamp format `yyyy:HH:mm:ss.SSS message`.

## Project Structure

- **CsvProcessor.java**: The main Java file containing the logic to:
  1. Read a CSV file encoded in Shift-JIS.
  2. Write the content to a new CSV file encoded in UTF-8.
  3. Read the new CSV file and log each line with a timestamp to a `.log` file.

## Prerequisites

- **Java Development Kit (JDK)**: Make sure you have JDK 8 or later installed.
- **Text Editor or IDE**: Use any text editor or IDE that supports Java (e.g., IntelliJ IDEA, Eclipse, VS Code).

## Setup Instructions

1. **Clone or download the project**: Download the project files and place them in your desired directory.

2. **Modify the file paths**:
   - Update the `inputFilePath`, `outputFilePath`, and `logFilePath` in the `CsvProcessor.java` file to point to your CSV file and desired output locations.

3. **Compile the Java program**:
   - Open a terminal or command prompt.
   - Navigate to the directory containing the `CsvProcessor.java` file.
   - Compile the Java program using the command:
     ```
     javac CsvProcessor.java
     ```

4. **Run the program**:
   - After compilation, run the program with the command:
     ```
     java CsvProcessor
     ```

## How It Works

1. **Reading the CSV File**:
   - The program reads the CSV file specified by `inputFilePath` using the Shift-JIS encoding.

2. **Writing the CSV File**:
   - The content is then written to a new CSV file specified by `outputFilePath` using UTF-8 encoding.

3. **Logging to a .log File**:
   - The program reads the newly created CSV file and writes each line to a `.log` file, adding a timestamp to each line.

## Example Usage

- **Input CSV**: Suppose you have a CSV file `input.csv` with Shift-JIS encoding.
- **Output CSV**: The program will create an `output.csv` in UTF-8 encoding.
- **Log File**: The program will create an `output.log` file, where each line is prefixed with a timestamp in the format `yyyy:HH:mm:ss.SSS`.

### Sample Log Entry

```
2024:13:45:12.123 Some CSV content
2024:13:45:12.124 Another CSV line
```

## Customization

- **Change Encoding**: Modify the `Charset` in the `writeCsvFile` method to handle different input or output encodings.
- **Timestamp Format**: Adjust the `SimpleDateFormat` pattern in the `readCsvFileAndWriteLog` method to customize the timestamp format.

## Troubleshooting

- **Cannot Find Symbol Error**: Ensure you have the correct import statements in your Java file.
- **File Not Found**: Verify the file paths are correct and the files exist at the specified locations.

## License

This project is open-source and free to use for any purpose.

---

