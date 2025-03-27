package annotation;

public class InfoExample {

    @InfoAnnotation(author = "Samir", date = "2025-03-23")
    public void displayInfo() {
        System.out.println("This method contains author information.");
    }
}
