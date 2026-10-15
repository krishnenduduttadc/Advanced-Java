package ExceptionHandling;


import java.io.*;

public class TryWithRsources {

    public static void main(String[] args) {

        try (BufferedReader reader =
                     new BufferedReader(
                             new StringReader("Hello Java"))) {

            System.out.println(reader.readLine());

        } catch (IOException e) {

            System.out.println("Reading failed");
        }
    }
}

