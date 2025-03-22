package quiz4;

public class Main {
    public static void main(String[] args) {
        //Task  3
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        app.display();
        factory = new MacOSFactory();
        app = new Application(factory);
        app.display();
        //Task  2
        Shape shape1 = ShapeFactory.makeShape("cIrcLe");
        Shape shape2 = ShapeFactory.makeShape("rectangle");
        shape1.draw();
        shape2.draw();
        //Task 1
        Singleton.getInstance();
        //Task 4
        Computer myComputer = new Computer.ComputerBuilder()
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setCPU("Intel Core i9")
                .setGraphicsCard("NVIDIA RTX 4060")
                .build();
        System.out.print(myComputer);
    }
}
