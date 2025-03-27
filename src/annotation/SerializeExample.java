package annotation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        SerializableUser user = new SerializableUser("Ali", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("User obyekti serializasiya olundu!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
