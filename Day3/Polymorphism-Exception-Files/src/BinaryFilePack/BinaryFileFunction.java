package BinaryFilePack;

import java.io.*;

public class BinaryFileFunction {
    public String readFile(String fileName) {
        String lines = "";
        try {

            FileInputStream fileIs = new FileInputStream(fileName+".bin");
            ObjectInputStream is = new ObjectInputStream(fileIs);
            lines+=is.readUTF()+"\n";
            lines+=is.readUTF()+"\n";
            lines+=is.readInt();
            is.close();


        } catch (FileNotFoundException e) {
            //return e.getMessage();

            // e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
        return lines;

    }


    public void writeFile(String inputText, String outputTarget){
        String lines =inputText;
        try {
            //DataOutputStream din = new DataOutputStream(fo);

            FileOutputStream fo = new FileOutputStream(outputTarget+".bin");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeUTF("123 456 789");
            os.writeUTF("abc def jhh");
            os.writeInt(333);
            os.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
