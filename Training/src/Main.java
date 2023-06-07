import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String ss = JOptionPane.showInputDialog("Enter value");
        System.out.println("ss = " + ss);
        int x=0;
        try {
            x = Integer.parseInt(ss);
        }
        catch (NumberFormatException NumE){
            System.out.println("Not a number");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("x = " + x);


    }
}
