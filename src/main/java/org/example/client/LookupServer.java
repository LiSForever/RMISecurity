package org.example.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class LookupServer {
    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        Naming.lookup("rmi://127.0.0.1:1099/cmd");

    }
}
