package classroomwork12_03_25;

import java.io.*;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static final String FILE_NAME = "src/classroomwork12_03_25/users.dat";
    private Map<String, String> users = new HashMap<>();

    public UserManager() {
        loadUsersFromFile();  // Proqram başladıqda fayldan istifadəçiləri yükləyirik
    }

    //  Registration funksiyası
    public boolean registerUser(String username, String password) {
        if (users.containsKey(username)) {
            return false;  // İstifadəçi artıq mövcuddursa, qeydiyyata icazə vermirik
        }

        String encodedPassword = encodePassword(password); // Passwordu Base64 ilə kodlayırıq
        users.put(username, encodedPassword); // Kodlanmış passwordu yadda saxlayırıq
        saveUsersToFile();
        return true;
    }

    public boolean loginUser(String username, String password) {
        if (!users.containsKey(username)) {
            return false;
        }

        String encodedPassword = users.get(username);
        return checkPassword(password, encodedPassword);
    }

    // Fayldan istifadəçiləri yükləyirk
    private void loadUsersFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    users.put(parts[0], parts[1]); // İstifadəçi adı və Base64 kodlanmış şifrəni saxlayırıq
                }
            }
        } catch (IOException e) {
            System.err.println("Fayl oxuma xətası: " + e.getMessage());
        }
    }

    // İstifadəçiləri fayla yaziriq
    private void saveUsersToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Fayl yazma xətası: " + e.getMessage());
        }
    }


    private String encodePassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }

    //  Base64 ilə şifrəni deşifrə edib yoxlayan metod
    private boolean checkPassword(String password, String encodedPassword) {
        try {
            String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword));
            return decodedPassword.equals(password);
        } catch (IllegalArgumentException e) {
            System.err.println("Şifrə deşifrə edilərkən xəta yarandı!");
            return false;
        }
    }
}
