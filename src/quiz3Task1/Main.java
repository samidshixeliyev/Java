package quiz3Task1;

public class Main {
  public static void main(String[] args) {
      Person adam = new Person("Səmid",30);
      adam.introduce();
      Book kitab1=new Book("Cinayet ve ceza","Dostoyevski",1986);
      Book kitab2 = new Book("Title","Dostoyevski",1994);
      kitab2.displayDetails();
      kitab1.displayDetails();
      Student telebe = new Student();
      telebe.setGrade(55);
      telebe.setName("Semid");
      Car car = new Car("Toyota",180,4);
      car.displayInfo();
      Dog dog = new Dog("Rex", 3);
      Cat cat = new Cat("Mişa", 2);

      dog.makeSound(); // Rex deyir: Hav hav!
      cat.makeSound(); // Mişa deyir: Miyav miyav!
      Shape circle = new Circle(5); // Radiusu 5 olan dairə
      Shape rectangle = new Rectangle(4, 6); // 4x6 ölçüsündə düzbucaqlı

      System.out.println("Dairənin sahəsi: " + circle.calculateArea());
      System.out.println("Düzbucaqlının sahəsi: " + rectangle.calculateArea());
  }
}
