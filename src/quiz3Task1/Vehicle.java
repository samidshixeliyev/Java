package quiz3Task1;

public class Vehicle {
    protected String brand;
    protected int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    protected void displayInfo(){
        System.out.println("Brand: " + brand+", Speed: " + speed);
    }
}


