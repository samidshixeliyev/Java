package io_filereader_writer;
import java.io.FileWriter;
import java.io.IOException;
//Yazdigim ve oxucagim file default JavaFirst folderin altinda olur
public class WriteFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Salam, dünya!\nJava IO nümunəsi.\n Men idi fayla output cixardacam");
            System.out.println("Məlumat fayla yazıldı.");
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }
}
