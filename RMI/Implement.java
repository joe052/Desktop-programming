package RMI;

import java.rmi.RemoteException;

public class Implement implements Message {

    @Override
    public void printMsg() throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("Welcome to my world!");
    }
    
}
