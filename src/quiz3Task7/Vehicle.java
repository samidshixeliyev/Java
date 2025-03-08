package quiz3Task7;

public abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    // Abstrakt metodlar
    abstract void start();
    abstract void stop();
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
