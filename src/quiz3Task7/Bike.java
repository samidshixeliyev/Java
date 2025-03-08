package quiz3Task7;

public class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }
    @Override
    void start() {
        System.out.println(brand + " Bike is starting by pedaling...");
    }

    @Override
    void stop() {
        System.out.println(brand + " Bike is stopping by hand brakes...");
    }
}
