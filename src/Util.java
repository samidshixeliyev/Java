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
            case "/":
                if (secondNumber == 0) {UserInputOutput.printText("0 bolme emeliyyati etdiniz ");} else
                {System.out.println(firstNumber / secondNumber);}
                break;
            default:
                System.out.println("Yanlis emiliyyat daxil etdiniz");
        }

    }

    public static void printMonthForNumber (int num){
        switch (num){
            case 1:
                System.out.println("Yanvar");
                break;
            case 2:
                System.out.println("Fevral");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("İyun");
                break;
            case 7:
                System.out.println("İyul");
                break;
            case 8:
                System.out.println("Avqust");
                break;
            case 9:
                System.out.println("Sentyabr");
                break;
            case 10:
                System.out.println("Oktyabr");
                break;
            case 11:
                System.out.println("Noyabr");
                break;
            case 12:
                System.out.println("Dekabr");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi daxil etdiniz!");
                break;
        }
    }
}
