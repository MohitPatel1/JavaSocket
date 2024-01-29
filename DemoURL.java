import java.net.*;
public class DemoURL {
    public static void main(String args[])throws MalformedURLException{
        try{
            URL obj = new URL("https://teziapp.com/");
            System.out.println(("protocol:" + obj.getProtocol()));
            System.out.println(("port:" + obj.getPort()));
            System.out.println(("host:" + obj.getHost()));
            System.out.println(("File:" + obj.getFile()));

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
