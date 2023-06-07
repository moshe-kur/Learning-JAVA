import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //Connect to server socket
            Socket client = new Socket("localhost",5000);
            System.out.println("Client in connected");

            //Send data to server
            Scanner scanner = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(client.getOutputStream());
            while (true){
                System.out.print("Enter Data: ");
                String data = scanner.nextLine();
                pw.println(data);
                pw.flush();

            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
