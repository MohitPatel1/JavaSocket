import java.net.*;

public class TeziAddressLookup{
    public static void main(String args[]){
        try{
            InetAddress in=InetAddress.getLocalHost();
            InetAddress[] tezi=InetAddress.getAllByName("www.teziapp.com");

            for(int i=0; i<tezi.length;i++){
                System.out.println(tezi[i]);
            }
            System.out.println(in);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}