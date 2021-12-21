package interfaces;

import java.rmi.RemoteException;

public class impClasse implements Hello {

    @Override
    public void showMsg() throws RemoteException {
        System.out.println("hello mes loulous");
    }
}
