import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])
    {
		try{
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket = serverSocket.accept();
			System.out.println("Listening on port 8000");
			DataInputStream input = new DataInputStream(socket.getInputStream());
			while(true){
				String val = input.readUTF();
				System.out.print("Sent from client: "+val);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}