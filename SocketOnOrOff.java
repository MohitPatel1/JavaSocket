import java.io.*;
import java.net.*;

public class SocketOnOrOff {
    public static void main(String[] args) throws IOException{
                ServerSocket server_socket = new ServerSocket(1234);
                if (server_socket != null && !server_socket.isClosed()){
                    
                        System.out.println("socket is open");
                    
                }else{
                    System.out.println(server_socket);
                    System.out.println("socket was closed");

                }

    //     while(true){
    //         Socket Listen_socket = server_socket.accept();
    //         BufferedReader client_input = new BufferedReader(new InputStreamReader(Listen_socket.getInputStream()));
    //         String client_str;
    //         client_str = client_input.readLine();
    //         System.out.println(client_str);

    //         // Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         //     if (server_socket != null && !server_socket.isClosed()){
    //         //         try{
    //         //             server_socket.close();
    //         //         }catch(IOException e){
    //         //             e.printStackTrace();
    //         //         }
    //         //     }
    //         // }));
    //     }
    }
}
