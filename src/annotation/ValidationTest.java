package annotation;

public class ValidationTest {
    public static void main(String[] args) {
        try {
            User user1 = new User("Samir", "samir@example.com");
            Validator.validate(user1);

            User user2 = new User("", "example@gmail.com");
            Validator.validate(user2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
