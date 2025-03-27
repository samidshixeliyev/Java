package annotation;

import java.io.Serializable;

public class SerializableUser implements Serializable {

        private static final long serialVersionUID = 1L; // Versiya UID
        String name;
        transient int age;  //Bu obyekt serialize olunanda serialize olunmayacaq

        public SerializableUser(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

}
