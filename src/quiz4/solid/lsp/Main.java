package quiz4.solid.lsp;

// Bütün quşların ümumi xüsusiyyətləri üçün əsas sinif
abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

// Uçan quşlar üçün ayrıca interfeys
interface FlyingBird {
    void fly();
}

// Sərçə (uçan quş) sinfi
class Sparrow extends Bird implements FlyingBird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is chirping.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}

// Pinqvin (uçmayan quş) sinfi
class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " is honking.");
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

// Test
public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("Sparrow");
        Penguin penguin = new Penguin("Penguin");

        sparrow.makeSound();
        sparrow.fly();

        penguin.makeSound();
        penguin.swim();
    }
}
