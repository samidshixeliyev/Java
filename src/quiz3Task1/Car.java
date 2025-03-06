package quiz3Task1;

public class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo(){
        super.displayInfo();
    }


}