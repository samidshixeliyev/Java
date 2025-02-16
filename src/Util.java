import java.util.Scanner;

public class Util {

    public static void sortArray(int[] arr, Boolean asc) {
        if (asc) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int tempMin = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tempMin;
                    }
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int tempMin = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tempMin;
                    }
                }
            }
        }
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Cüt ədəddir");
        } else {
            System.out.println("Tək Ədəddir");
        }
    }

    public static void isEqual(int input1, int input2) {
        if (input1 == input2) {
            System.out.println("Ədədlər bərabərdir!…");
        } else {
            System.out.println("Ədədlər bərabər deyil!");
        }
    }

    public static void isCompositeNumber(int number) {
        if (number % 2 == 0 && number > 2) {
            System.out.println("Daxil etdiyimiz eded murekkeb ededdir");
        } else {
            System.out.println("Daxil etdiyimiz eded sade ededdir");
        }
    }

    public static void basicCalculator(int firstNumber, int secondNumber, String operator) {
        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Yanlis emiliyyat daxil etdiniz");
        }
    }



}
