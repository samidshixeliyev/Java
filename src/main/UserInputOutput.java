package main;

import java.util.Scanner;

public class UserInputOutput    {
    private static final Scanner scanner = new Scanner(System.in);
        public static int getUserIntInput(){
            return scanner.nextInt();
    }
        public static String getUserStringInput(){
            return scanner.next();
    }
        public static double getUserDoubleInput(){
            return scanner.nextDouble();
        }
        public static void printText(String message){
            System.out.println(message);
        }
        public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }

    }
    //For Task6.2.3
        public static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i < array.length - 1) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }
    // For task 6.3
    public static void searchInArray(int[] array, int target) {
        boolean found = false;

        for (int element : array) {
            if (element == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Ədəd tapıldı");
        } else {
            System.out.println("Ədəd tapılmadı");
        }
    }

    }







