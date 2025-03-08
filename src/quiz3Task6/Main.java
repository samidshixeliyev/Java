package quiz3Task6;

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar(); // Guitar obyekti yaradılır
        Playable piano = new Piano(); // Piano obyekti yaradılır

        guitar.play();
        piano.play();

        Movable car = new Car();
        Movable robot = new Robot();

        car.move();
        robot.move();
    }
}
