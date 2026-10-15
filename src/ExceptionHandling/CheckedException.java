package ExceptionHandling;


import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        try {
            FileReader reader =
                    new FileReader("data.txt");

            reader.close();

        } catch (IOException e) {

            System.out.println("File operation failed");
        }
    }
}


