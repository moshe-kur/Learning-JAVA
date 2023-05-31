package EnumPack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7: ");
        int number = reader.nextInt();
        if (number>0 && number<8){
            DayOfWeek day = DayOfWeek.values()[number-1];
            System.out.println("Day of the week: " + day);
        }
       else {
            System.out.println("number should be between 1 and 7 you number is: " + number);
        }


    }
}
