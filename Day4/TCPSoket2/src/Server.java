import java.net.*;
import java.io.*;
import java.util.*;
public class Server {
    public static void main(String[] args) {
        try {
            //open socket
            ServerSocket ss =new ServerSocket(5000);
            System.out.println("Waiting to client");
            Socket server = ss.accept();
            System.out.println("Server in connected");

            //read data from client
            BufferedReader br =new BufferedReader(new InputStreamReader(server.getInputStream()));
            //sent data to client
            PrintWriter pw = new PrintWriter(server.getOutputStream());

            while (true){
                String data= br.readLine();
                System.out.println("Data from Server: "+data);

                String serverData = "Get client Data: "+data.substring(0,data.length()/2)+"...";
                pw.println(serverData);
                pw.flush();
            }
            //from server to client
            /*
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.print("Enter Data: ");
                String data = scanner.nextLine();

            }

             */
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
