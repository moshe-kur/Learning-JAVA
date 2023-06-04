package FilePack;

import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //initialization variable, file function, Scanner
        String source,target,lines = "";
        fileFunctions fileFunction = new fileFunctions();
        Scanner scanner = new Scanner(System.in);

        //get source file from the user
        System.out.println("Please enter source File: ");
        source = scanner.nextLine();

        //send to readFile function
        try {
            lines = fileFunction.readFile(source);
        }
        catch (Exception e){
            //send message and stop running the program
            System.out.println("File not Found");
            return;
            //System.out.println(e.getMessage());
        }

        lines.contains("The system cannot find the file specified");

        System.out.println(lines);
        //get Target file from the user
        System.out.println("Please enter target File: ");
        target = scanner.nextLine();

        //processContents
        lines = fileFunction.processContents(lines);

        //Write new process contents to target File
        fileFunction.writeFile(lines,target);



    }



}
