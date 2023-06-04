package DivisionException;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            int num1,num2;
            float sum;
            System.out.println("Enter a First number: ");
            Scanner scanner = new Scanner(System.in);
            num1 = scanner.nextInt();
            System.out.println("Enter a second number: ");
            num2 = scanner.nextInt();
            /*
            //To show Float numbers
            if (num2 == 0) {
                throw new ArithmeticException();
            }
            sum=  (float) num1 /num2;
             */
            sum=  num1 /num2;
            System.out.println("result: "+sum);
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input! Please enter integers only"+e.toString());
        }
        catch (Exception e){
            System.out.println("Invalid input! Please enter integers only"+e.getMessage());

        }
    }
}