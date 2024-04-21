import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try {
            FileInputStream inputStream = new FileInputStream(inputFile); // Corrected variable name
            FileOutputStream outputStream = new FileOutputStream(outputFile); // Corrected class name and variable name

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) { // Corrected the placement of parentheses
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("byte stream copied");
            inputStream.close(); // Added to close the input stream
            outputStream.close(); // Added to close the output stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
