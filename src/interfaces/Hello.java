package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {

    public void showMsg() throws RemoteException;
}
