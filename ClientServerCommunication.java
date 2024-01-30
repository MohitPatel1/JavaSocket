import java.io.*;
import java.net.*;

public class ClientServerCommunication {
    public static void main(String[] args) throws Exception{
        try{
        System.out.println("client connected");
        while (true) {                    
        Socket s1 = new Socket("mohit", 1234);
        BufferedReader user_input = new BufferedReader((new InputStreamReader(System.in))); // system.in gets console inputs
        // BufferedReader server_input = new BufferedReader((new InputStreamReader(s1.getInputStream())));
        DataOutputStream server_out = new DataOutputStream(new DataOutputStream(s1.getOutputStream()));
        
        String userString,serverString;
        // serverString = server_input.readLine();
        // System.out.println(serverString);
        userString = user_input.readLine();
        server_out.writeBytes(userString + "\n");
        s1.close();
        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
