package quiz3Task7;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @Override
    void start() {
        System.out.println(brand + " Car is starting with an engine...");
    }
    @Override
    void stop() {
        System.out.println(brand + " Car is stopping using brakes...");
    }
}
