package quiz3Task7;

public abstract class Shape {
    abstract double calculateArea();
    // Adi metod
    public void displayInfo() {
        System.out.println("Area: " + calculateArea());
    }
}
