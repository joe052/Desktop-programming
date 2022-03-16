package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote{
     void printMsg()throws RemoteException;
}