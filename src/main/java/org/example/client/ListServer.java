package org.example.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ListServer {
    public static void main(String[] args) throws MalformedURLException, RemoteException {
        String[] serverlist = Naming.list("rmi://127.0.0.1");
        for(String server : serverlist){
            System.out.println(server);
        }
    }
}
