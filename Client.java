import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String args[]) throws Exception{
        System.out.println("client started");
        Socket client_socket = new Socket("mohit",1234);
        while (true) {
            BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream server_out = new DataOutputStream(client_socket.getOutputStream());
            String str;
            str = user_input.readLine();
            server_out.writeBytes(str+"\n");
            client_socket.close();
        }
    }
}

// client is sending one message and getting terminated
// create new socket for each iteration and closed is.

// Q1) why can i send only one message per socket connection? 