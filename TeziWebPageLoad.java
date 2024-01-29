// get webpage, write its content to terminal

import java.io.InputStream;
import java.net.*;

public class TeziWebPageLoad {
    public static void main(String[] args) throws Exception{
        int ch;
        URL handle = new URL("https://teziapp.com");
        URLConnection handle_connection = handle.openConnection();
        System.out.println("content type:  " + handle_connection.getContentType());
        System.out.println("content length:  " + handle_connection.getContentLength());
        if(handle_connection.getContentLength()!=0){
            InputStream input_string = handle_connection.getInputStream();
            while ((ch = input_string.read()) != -1) {
                System.out.print((char)ch);
            }
        }else{
            System.out.println("there is no content for this website");
        }

    }
}
