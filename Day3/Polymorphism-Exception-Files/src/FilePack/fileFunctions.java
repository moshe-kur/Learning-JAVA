package FilePack;

import java.io.*;

public class fileFunctions {

    public String readFile(String input) {
        String lines = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input+".txt"));
            String line;
            while ((line = reader.readLine()) != null){
                lines+=line+"\n";
            }

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


    public String processContents(String inputText) {
        String lines =inputText;
        lines = lines.replace(' ','_');
        return lines;

    }

    public void writeFile(String inputText, String outputTarget){
        String lines =inputText;
        try {
            Writer writer = new BufferedWriter(new FileWriter(outputTarget+".txt"));
            writer.write(lines);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
