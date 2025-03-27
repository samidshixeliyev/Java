package annotation;

public class User {
    @NotEmpty
    private String username;

    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
