package YCourse;


import java.util.Scanner;

public class ClearScannerInt {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter string1");
        String str1 = scanner.nextLine();
        System.out.println("str1 = " + str1);

        System.out.println("Enter string2");
        String str2 = scanner.nextLine();
        System.out.println("str2 = " + str2);

        System.out.println("Enter int");
        int num1 = scanner.nextInt();
        System.out.println("int = " + num1);
        String sss = scanner.nextLine();

        System.out.println("Enter string3 "+sss);
        String str3 = scanner.nextLine();
        System.out.println("str3 = " + str3);



    }
}
