package task_6_3;

import main.UserInputOutput;
import main.Util;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UserInputOutput.printText("Arraya 10 eded daxil edin");
        int [] nums =new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = UserInputOutput.getUserIntInput();
            if(i==nums.length-1){
                UserInputOutput.printText(nums[i] + " arraya daxil edildi");
            }
            else
            {UserInputOutput.printText(nums[i] + " arraya daxil edildi \n Novbeti ededi daxil edin: ");}
        }
        UserInputOutput.printText("Arrayde  axtardigin ededi daixil et");
        int x = UserInputOutput.getUserIntInput();
        UserInputOutput.searchInArray(nums,x);
        //Task 6.3.2
        for (int num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        //Task 6.3.3
        UserInputOutput.printText("\nArrayde ikinci en boyuk ve ya ikinci en kicik ededi axtaririq nezere aliriq ki bu distinc arraydir");
        int [] array ={5,7,9,15,13,28,35,48};
        Util.sortArray(array,true);
        UserInputOutput.printText("Arrayin ikinci en kicik ededi: "+ array[1]+"\n Arayin ikici en boyuk ededi: "+ array[array.length-1]);
        //Task 6.3.4
        boolean first = true;

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(nums[i]);
                first = false;
            }
        }

    }

}
