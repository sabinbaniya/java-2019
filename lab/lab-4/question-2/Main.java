//WAP to create an Echo server and client in java.
import java.net.*;
import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main(String args[])
    {
		try{

			Socket socket = new Socket("localhost",8000);
			System.out.println("Successfully connected to the server...");
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			DataInputStream input = new DataInputStream(socket.getInputStream());
			String val = "";
			while(true){
				System.out.print("Send to server: ");
				String message = new Scanner(System.in).nextLine();
				output.writeUTF(message);
				output.flush();
				val = input.readUTF();
				System.out.println(val);

			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}