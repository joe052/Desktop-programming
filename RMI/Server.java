package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends Implement{
    public Server(){}

    public static void main(String[] args) {
        try {
             //instantiating the implementing class
             Implement obj = new Implement();

             //exporting the object of implementation class
             //exporting the remote object to the stub
             Message stub = (Message) UnicastRemoteObject.exportObject(obj, 0);

             //binding the remote object in the registry
             Registry registry = LocateRegistry.getRegistry();

             registry.bind("Hello", stub);    
             System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
