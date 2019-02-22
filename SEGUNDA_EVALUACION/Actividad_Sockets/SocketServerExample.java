```java

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class SocketServerExample {
    
    	 public static final int port = 4444;
    	   private ServerSocket ss = null;

    	    public void  runServer() throws IOException, ClassNotFoundException{
    	        ss = new ServerSocket(port);
    	        System.out.println("El servidor esta pendiente de aceptar peticiones");
    	        Socket socket = ss.accept();
    	        
    	        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
    	        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());

    	        Mensaje m = (Mensaje) is.readObject();
    	        Mensaje.Calculos(m);

    	        os.writeObject(m);
    	        socket.close(); 
    	    }

   

    	    public static void main(String[] args) throws ClassNotFoundException, IOException {
    	        new SocketServerExample().runServer();
    	    }
}
    	
   




´´´
