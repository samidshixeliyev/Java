package quiz3Task7;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bike("Yamaha");

        myCar.displayBrand();
        myCar.start();
        myCar.stop();

        System.out.println();

        myBike.displayBrand();
        myBike.start();
        myBike.stop();
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle:");
        circle.displayInfo();

        System.out.println("\nRectangle:");
        rectangle.displayInfo();
    }
}
