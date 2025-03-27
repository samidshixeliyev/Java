package sorting_comparing_iteration;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Yaşa görə sıralayan Comparator
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age; // Artan sıraya görə
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ali", 22),
                new Student("Veli", 19),
                new Student("Ayşe", 25)
        );
        List<String> names = Arrays.asList("Ali", "Mehmet", "Ayşe", "Veli");
        List<Person> people = Arrays.asList(
                new Person("Mehmet"),
                new Person("Ali"),
                new Person("Ayşe")
        );

        Collections.sort(students, new AgeComparator());
        Collections.sort(names, new NameLengthComparator());
        System.out.println(names);

        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
        Collections.sort(people);
        for (Person p : people) {
            System.out.printf(p.name+" ");
        }
    }

}

