package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
   private Client(){} 

   public static void main(String[] args) {
      try {
          //Getting the registry
          Registry registry = LocateRegistry.getRegistry(null);

          //looking up the registry for the remote object
          Message stub = (Message) registry.lookup("Hello");

          //calling the remote method using the obtained object
          stub.printMsg();
          //System.out.println("Invoked!!");
      } catch (Exception e) {
          System.err.println("Client exception: "+ e.toString());
          e.printStackTrace();
      } 
   }
}
