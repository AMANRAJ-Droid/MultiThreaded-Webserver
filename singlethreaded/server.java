import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server{

    public void run() throws IOException{
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while(true){
            try{
                System.out.println("Server is listening on port"+ port);
                  Socket acceptedConnection = socket.accept();
                  System.out.println("Connection accepted"+acceptedConnection.getRemoteSocketAddress());
                  PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream());
                  BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
                  toClient.println("hello from the server");
                  toClient.close();
                  fromClient.close();
                  acceptedConnection.close();


            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        
        
        }}


    
    public static void main(String[] args){
        server server = new server();
        try {
            server.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    }
