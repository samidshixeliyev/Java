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
    }





//        int firstNumber;
//        firstNumber = scanner.nextInt();//
//        Util.printText("Enter the second number: ");
//        int secondNumber;
//        secondNumber = scanner.nextInt();//
//        Util.printText("Enter the number for check is even: ");
//        int number;
//        number = scanner.nextInt();//
//        Util.printText("Enter the operator: ");
//        String operator;
//        operator = scanner.next();/
//        Util.isEqual(firstNumber,secondNumber);
//        Util.isEven(number);
//        Util.isCompositeNumber(number);
//        Util.printText("The result of calculation: ");
//        Util.basicCalculator(firstNumber,secondNumber,operator);


    //tapsiriqin helli
    /*
    *  for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        Util.printText("The average is " + avg);
        Util.printText("The sum is " + sum);
    * */


