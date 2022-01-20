import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

class Server
{ 
	public static void main(String args[])
    {
        try{

            int inputPort = 3000, outputPort = 5000;
            
            DatagramSocket socket = new DatagramSocket(outputPort);
            
            InetAddress ip = InetAddress.getByName("127.0.0.1");  
            
            while(true)
            {
                byte data[] = new byte[1024];
                DatagramPacket dp = new DatagramPacket(data, data.length);
                socket.receive(dp);
                System.out.println("Client says: "+new String(dp.getData(),0,dp.getLength()));
                String msg = new Scanner(System.in).nextLine();
                socket.send(new DatagramPacket(msg.getBytes(),msg.length(), ip, inputPort));
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
		
	}
}