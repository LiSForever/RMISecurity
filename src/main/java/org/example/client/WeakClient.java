package org.example.client;

import org.example.remoteInterface.ReturnObj;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class WeakClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);

        ReturnObj returnObj = (ReturnObj) registry.lookup("returnObjServer");

        Object object = returnObj.returnObj();
    }
}
