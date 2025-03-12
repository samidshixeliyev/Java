package io_filereader_writer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Adınızı daxil edin: ");
            String name = reader.readLine();
            System.out.println("Salam, " + name + "!");
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }
}

