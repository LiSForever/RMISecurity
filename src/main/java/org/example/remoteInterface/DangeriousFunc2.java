package org.example.remoteInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DangeriousFunc2 extends Remote {
    public Object getAnytypeParams(Object obj) throws RemoteException;
}
