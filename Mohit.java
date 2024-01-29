import java.net.*;

public class Mohit{
    public static void main(String args[]){
        try{
            InetAddress in=InetAddress.getLocalHost();
            System.out.println(in);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}