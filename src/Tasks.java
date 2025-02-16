import java.util.Scanner;

public class Tasks {



    //Task 2 2
    /*
     *İstifadəçidən bir məktub (A, B, C, D və s.) alın və bu məktubun qiymət dərəcəsini yazdırın (A - Əla, B - Yaxşı, C - Kafi, D - Zəif).
     */
public static void getGrade(String grade){

    UserInputOutput.printText("Bir məktub daxil edin (A, B, C, D):");
    switch (grade) {
        case "A":
            System.out.println("Əla");
            break;
        case "B":
            System.out.println("Yaxşı");
            break;
        case "C":
            System.out.println("Kafi");
            break;
        case "D":
            System.out.println("Zəif");
            break;
        default:
            System.out.println("Yanlış məktub daxil etdiniz!");
            break;
    }
}
    /*
        Task 3/1
     * 1-dən 100-ə qədər olan bütün tək ədədləri ekrana yazdırın.
     */
      public static void evenNumbersTo100(){
          for (int i = 1; i <= 100; i++) {
              if (i % 2 != 0) {
                  System.out.println(i);
              }
          }
      }







}
