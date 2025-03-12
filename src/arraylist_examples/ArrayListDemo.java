package arraylist_examples;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1️⃣ ArrayList yaratmaq və element əlavə etmək
        ArrayList<String> names = new ArrayList<>();
        names.add("Samir");
        names.add("Aygün");
        names.add("Elvin");

        // 2️⃣ Elementlərə müraciət
        System.out.println("Birinci element: " + names.get(0));

        // 3️⃣ Element silmək
        names.remove("Aygün");

        // 4️⃣ ArrayList ölçüsü
        System.out.println("ArrayList ölçüsü: " + names.size());

        // 5️⃣ Bütün elementləri çap etmək
        System.out.println("Bütün adlar:");
        for (String name : names) {
            System.out.println(name);
        }

        // 6️⃣ Generics ilə fərqli tiplərlə işləmək
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        // 7️⃣ ArrayList-də sıralama
        Collections.sort(numbers);
        System.out.println("Artan sırayla: " + numbers);

        numbers.sort(Collections.reverseOrder());
        System.out.println("Azalan sırayla: " + numbers);

        // 8️⃣ ArrayList-də element axtarmaq
        System.out.println("Samir var? " + names.contains("Samir"));
        System.out.println("Elvin haradadır? " + names.indexOf("Elvin"));

        // 9️⃣ ArrayList ilə polymorphism
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        System.out.println("Heyvan səsləri:");
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}

// 🔹 Polymorphism üçün sadə Animal sinifləri
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}