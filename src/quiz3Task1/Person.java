package quiz3Task1;

public class Person {
    private String name;
    private int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("Salam, mənim adım " + this.name + "dir və mən "+ this.age+" yaşındayam");
    }
}
