package task_6_4;

import main.UserInputOutput;
import main.Util;

public class Main {
    public static void main(String[] args) {
        //Task 6.4.1
        int [] nums =new int[6];
        UserInputOutput.printText("Enter 6 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = UserInputOutput.getUserIntInput();
            if(i==nums.length-1){
                UserInputOutput.printText(nums[i] + " arraya daxil edildi");
            }
            else
            {UserInputOutput.printText(nums[i] + " arraya daxil edildi \n Novbeti ededi daxil edin: ");}
        }
        Util.sortArray(nums,true);
        UserInputOutput.printArray(nums);
    }
}
