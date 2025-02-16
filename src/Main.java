import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1

        UserInputOutput.printText("Enter the number 1: ");
        int x1=UserInputOutput.getUserIntInput();
        UserInputOutput.printText("Enter the number 2: ");
        int y1=UserInputOutput.getUserIntInput();
        Util.isEqual(x1,y1);

        //Task2
        UserInputOutput.printText("Enter the number: ");
        int x2=UserInputOutput.getUserIntInput();
        Util.isCompositeNumber(x2);

        //Task3
        UserInputOutput.printText("Enter the number: ");
        int x3=UserInputOutput.getUserIntInput();
        Util.isEven(x3);

        //Task4

        UserInputOutput.printText("Enter the number 1: ");
        int x4=UserInputOutput.getUserIntInput();
        UserInputOutput.printText("Enter the number 2: ");
        int y4=UserInputOutput.getUserIntInput();
        UserInputOutput.printText("Enter the operator: ");
        String operator=UserInputOutput.getUserStringInput();
        Util.basicCalculator(x4,y4,operator);

        int [] numbers =new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = UserInputOutput.getUserIntInput();
            System.out.print(numbers[i] + " arraya daxil edildi \n Novbeti ededi daxil edin: \n");
        }

        Util.sortArray(numbers,false);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        Tasks.evenNumbersTo100();
    }

}
