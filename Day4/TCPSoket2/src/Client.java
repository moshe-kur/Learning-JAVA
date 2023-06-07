import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //connect to socket
            Socket client = new Socket("localhost",5000);
            System.out.println("Client in connected");

            //Scanner to get user data
            Scanner scanner = new Scanner(System.in);

            //sent data to server
            PrintWriter pw = new PrintWriter(client.getOutputStream());

            //get data from server back
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

            while (true){
                System.out.print("Enter Data: ");
                String data = scanner.nextLine();
                pw.println(data);
                pw.flush();
                String serverData = br.readLine();
                System.out.println("serverData: " + serverData);
            }
            /*
            //read from server
            while (true){
                String data= br.readLine();
                System.out.println("Data from Server: "+data);
            }

             */


        }catch (Exception e){
            System.out.println(e);
        }

    }
}
