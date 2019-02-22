```java



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientThread extends Thread {
 
	
	    public static void main(String[] args) throws UnknownHostException,
	            IOException, ClassNotFoundException {
	    
	        Socket socket = new Socket("localhost", 4444);
	        System.out.println("Cliente conectado");
	        
	        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
	        
	        System.out.println("Ok");
	        Mensaje m =null;
	        
	        Mensaje.Calculos(m);
	        os.writeObject(m);
	        System.out.println("Enviando informacion al servidor ...");

	        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
	        Mensaje returnMensaje = (Mensaje) is.readObject();
	        System.out.println("El resultado de tu operacion es el siguiente :" + returnMensaje);
	        socket.close();
	    }
	}





´´´
