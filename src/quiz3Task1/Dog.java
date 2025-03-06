package quiz3Task1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " deyir: Hav hav!");
    }
}
