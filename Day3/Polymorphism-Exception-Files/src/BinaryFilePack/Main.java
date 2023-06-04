package BinaryFilePack;

import java.io.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        try {

            BinaryFileFunction bff = new BinaryFileFunction();


            System.out.println(bff.readFile("Mybn"));


            bff.writeFile(" ","Mybn");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}