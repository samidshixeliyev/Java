package classroomwork12_03_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- İstifadəçi Sistemi ----");
            System.out.println("1. Qeydiyyat");
            System.out.println("2. Giriş");
            System.out.println("3. Çıxış");
            System.out.print("Seçiminizi daxil edin: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("İstifadəçi adı: ");
                    String username = scanner.nextLine();
                    System.out.print("Şifrə: ");
                    String password = scanner.nextLine();

                    if (userManager.registerUser(username, password)) {
                        System.out.println("Qeydiyyat uğurla tamamlandı!");
                    } else {
                        System.out.println("Bu istifadəçi adı artıq mövcuddur!");
                    }
                    break;

                case 2:
                    System.out.print("İstifadəçi adı: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Şifrə: ");
                    String loginPassword = scanner.nextLine();

                    if (userManager.loginUser(loginUsername, loginPassword)) {
                        System.out.println("Giriş uğurla tamamlandı. Xoş gəldiniz, " + loginUsername + "!");
                    } else {
                        System.out.println("Yanlış istifadəçi adı və ya şifrə!");
                    }
                    break;

                case 3:
                    System.out.println("Çıxış edildi.");
                    return;

                default:
                    System.out.println("Yanlış seçim! Zəhmət olmasa 1, 2 və ya 3 seçin.");
            }
        }
    }
}
