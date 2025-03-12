package classroomwork12_03_25;

import java.util.Base64;

public class User {
    private final String name;
    private  String encodedPassword;
    public User(String name, String encodedPassword) {
        this.name = name;
        this.encodedPassword = encodedPassword;
    }
    public String getName() {
        return name;
    }
    public String getEncodedPassword() {
        return encodedPassword;
    }


}
