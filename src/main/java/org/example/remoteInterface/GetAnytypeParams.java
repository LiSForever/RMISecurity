package org.example.remoteInterface;

import java.lang.reflect.InvocationTargetException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GetAnytypeParams extends Remote {
    public Object getAnytypeParams(Object obj) throws RemoteException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
}
