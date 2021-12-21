package Client;

import interfaces.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public Client() {
    }

    public static void main(String[] args) {
        try{

        Registry reg = LocateRegistry.getRegistry(8083);

        Hello stub = (Hello) reg.lookup("hello");

        stub.showMsg();

        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}
