package quiz3Task1;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " deyir: Miyav miyav!");
    }
}
