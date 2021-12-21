package serveur;
import interfaces.Hello;
import interfaces.impClasse;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Serveur extends impClasse{


    public Serveur() {
    }

    public static void main(String[] args) {
    try{
        impClasse imp = new impClasse();

        Hello stub = (Hello) UnicastRemoteObject.exportObject(imp,0);

        Registry reg = LocateRegistry.createRegistry(8083);

        reg.bind("hello", stub);
        System.out.println("Le serveur est lance");
    }catch (Exception e){
        System.out.println(e.toString());
    }


    }
}
