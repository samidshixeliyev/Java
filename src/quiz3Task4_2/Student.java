package quiz3Task4_2;

public class Student {
    private String name;
    private int age;
    private static int totalStudents = 0; // Statik dəyişən - ümumi tələbə sayı

    // Konstruktor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++; // Yeni tələbə yaradıldıqda artır
    }

    public static void displayTotalStudents() {
        System.out.println(totalStudents);
    }
    // Tələbə məlumatlarını çap edən metod
    public void displayInfo() {
        System.out.println("Ad: " + name + ", Yaş: " + age);
    }
}

