package task_6;
import main.UserInputOutput;

public class Main {
    public static void main(String[] args) {
        UserInputOutput.printText("Arraya 5 eded daxil edin");
        int [] numbers =new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = UserInputOutput.getUserIntInput();
            if(i==numbers.length-1){
                UserInputOutput.printText(numbers[i] + " arraya daxil edildi");
            }
            else
            {UserInputOutput.printText(numbers[i] + " arraya daxil edildi \n Novbeti ededi daxil edin:");}
        }
        double sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;
        UserInputOutput.printText("Ededlerin cemi: "+ sum);
        UserInputOutput.printText("Ededlerin ortalaasi: "+ average);


        UserInputOutput.printText("Arraya 10 eded daxil edin");
        int [] numbers2 =new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = UserInputOutput.getUserIntInput();
            if(i==numbers2.length-1){
                UserInputOutput.printText(numbers2[i] + " arraya daxil edildi");
            }
            else
            {UserInputOutput.printText(numbers2[i] + " arraya daxil edildi \n Novbeti ededi daxil edin: ");}
        }
        int min = numbers2[0];
        int max = numbers2[0];
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] < min) {
                min = numbers2[i];
            }
            if (numbers2[i] > max) {
                max = numbers2[i];
            }
        }
        UserInputOutput.printText("Maximum: "+ max +"\n"+"Minimum: "+ min);
        int [] staticArray ={1,2,3,4,5};
        UserInputOutput.printText("Statik yaratdigimiz arrayin elementlerinin kvadratlari");
        for (int i = 0; i < staticArray.length; i++) {
            staticArray[i] = staticArray[i]*staticArray[i];
            System.out.print(i != staticArray.length - 1 ? staticArray[i] + "," : staticArray[i]+"\n");
        }
        //Task 6.2.1
        UserInputOutput.printText("Daxil olunmus tersine yazilmasi:");
        for (int i = numbers.length-1; i >=0; i--) {
            System.out.print(numbers[i] + " ");
        }
        //Task 6.2.2
        UserInputOutput.printText("\n Task 6.2.2 ucun bir eded daxil edin:");
        int x6=UserInputOutput.getUserIntInput();
        int [] arrayTask6 = new int[x6];
        for (int i = 0; i < arrayTask6.length; i++) {
            arrayTask6[i]=x6-i;
        }
        UserInputOutput.printArray(arrayTask6);
        //Task 6.2.3
        UserInputOutput.printArray(staticArray);
        //Task 6.2.4
        UserInputOutput.printText("Task 6.2.4 ucun arraye 6 eded daxil edin:");
        int [] arrayTask624 = new int[6];
        for (int i = 0; i < arrayTask624.length; i++) {
            arrayTask624[i]=UserInputOutput.getUserIntInput();
        }
        UserInputOutput.printArrayReverse(arrayTask624);

    }


}
