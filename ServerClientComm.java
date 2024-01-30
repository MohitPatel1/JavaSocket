import java.io.*;
import java.net.*;

public class ServerClientComm {
    public static void main(String args[])throws Exception{        
        ServerSocket server_socket = new ServerSocket(1234);
        System.out.println("server is on");
        while(true){
            Socket Listen_socket = server_socket.accept();
            BufferedReader client_input = new BufferedReader(new InputStreamReader(Listen_socket.getInputStream()));
            BufferedReader server_input = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream client_out = new DataOutputStream(Listen_socket.getOutputStream());
            String client_str,server_str;
            server_str = server_input.readLine();
            client_out.writeBytes(server_str + "\n");            
            client_str = client_input.readLine();
            System.out.println(client_str);
        }      
    }
}