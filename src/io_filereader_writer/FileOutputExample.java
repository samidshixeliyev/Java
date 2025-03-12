package io_filereader_writer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputExample {
    public static void main(String[] args) {
        String data = "Bu, FileOutputStream ilə yazılmış mətn məlumatıdır.";

        try (FileOutputStream fos = new FileOutputStream("output.bin");
             OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF-8")) {

            writer.write(data);
            System.out.println("Məlumat fayla yazıldı.");
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }
}

