package org.example.remoteInterface;

import java.lang.reflect.InvocationTargetException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Exec extends Remote {
    public void exec(String cmd) throws RemoteException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
