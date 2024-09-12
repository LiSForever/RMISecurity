package org.example.client;

import org.example.payload.CC3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EchoClient1 {
    public static void main(String[] args) throws Exception {
        String ip = "127.0.0.1"; //注册中心ip
        int port = 1099; //注册中心端口

        Object obj = CC3.getObject();

        try {
            Registry registry = LocateRegistry.getRegistry(ip, port);
            Remote r = (Remote) Proxy.newProxyInstance(Remote.class.getClassLoader(), new Class[]{Remote.class}, (InvocationHandler) obj);
            registry.bind("liming", r);
        } catch (Exception e) {
        try {
            System.out.print(e.getCause().getCause().getCause().getMessage());
        } catch (Exception ee) {
            throw e;
        }
    }
    }
}
