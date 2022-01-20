import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

class Client
{
	public static void main(String args[])
    {
        try{
            int inputPort = 3000, outputPort = 5000;

            DatagramSocket socket = new DatagramSocket(inputPort);

            InetAddress inetAddress = InetAddress.getLocalHost();

            while(true){
                byte data[] = new byte[1024];
                DatagramPacket dp = new DatagramPacket(data,data.length);
                String msg = new Scanner(System.in).nextLine();
                data = msg.getBytes();
                socket.send(new DatagramPacket(data,data.length, inetAddress, outputPort));
                socket.receive(dp);
                System.out.println("Server says: "+new String(dp.getData(),0,dp.getLength()));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
	}
}