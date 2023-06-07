import java.net.*;
import java.io.*;
import java.util.*;
public class Server {
    public static void main(String[] args) {
        try {
            //Open socket
            ServerSocket ss =new ServerSocket(5000);
            System.out.println("Waiting to client");
            Socket server = ss.accept();
            System.out.println("Server in connected");

            //read from client
            BufferedReader br =new BufferedReader(new InputStreamReader(server.getInputStream()));
            while (true){
                String data= br.readLine();
                System.out.println("Data from Server: "+data);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}
