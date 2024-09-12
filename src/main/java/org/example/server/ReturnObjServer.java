package org.example.server;


import org.example.payload.CC2;
import org.example.remoteInterface.ReturnObj;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ReturnObjServer extends UnicastRemoteObject implements ReturnObj {
    public ReturnObjServer() throws RemoteException {}
    @Override
    public Object returnObj() throws Exception {
        return CC2.getObject();
    }

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        ReturnObjServer returnObjServer = new ReturnObjServer();
        String host = "127.0.0.1";
        int port = 1099;
        Registry registry = LocateRegistry.getRegistry(host, port);
        registry.rebind("returnObjServer",returnObjServer);
    }
}
