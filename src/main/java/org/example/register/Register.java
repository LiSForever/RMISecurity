package org.example.register;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Register {
    public static void main(String[] args) throws RemoteException, InterruptedException {
        Registry registry =  LocateRegistry.createRegistry(1099);
        System.out.println("RMI registry started on port 1099");

        // 保持程序运行
        synchronized (Register.class) {
            Register.class.wait();
        }
    }
}
