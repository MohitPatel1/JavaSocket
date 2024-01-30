import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[])throws Exception{
        ServerSocket server_socket = new ServerSocket(1234);
        System.out.println("socket is on");
        while(true){
            Socket Listen_socket = server_socket.accept();
            BufferedReader client_input = new BufferedReader(new InputStreamReader(Listen_socket.getInputStream()));
            String client_str;
            client_str = client_input.readLine();
            System.out.println(client_str);

            // Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            //     if (server_socket != null && !server_socket.isClosed()){
            //         try{
            //             server_socket.close();
            //         }catch(IOException e){
            //             e.printStackTrace();
            //         }
            //     }
            // }));
        }

        
    }


}

// after the program execution or after termination
// Socket is closed.