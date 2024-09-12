package org.example.server;

import org.example.remoteInterface.Exec;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CmdServer extends UnicastRemoteObject implements Exec {
    protected CmdServer() throws RemoteException {
    }

    @Override
    public void exec(String cmd) throws RemoteException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 获取Runtime类
        Class<?> clazz = Class.forName("java.lang.Runtime");
// 获取Runtime的方法exec(String str)
        Method execMethod = clazz.getMethod("exec", String.class);
// 获取Rumtime的方法getRuntime()
        Method getRuntimeMethod = clazz.getMethod("getRuntime");
// 执行Runtime.getRuntime()，获取对象runtime
        Object runtime = getRuntimeMethod.invoke(clazz);
// 执行runtime.exec("calc.exe")
        execMethod.invoke(runtime, cmd);
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        CmdServer cmdServer = new CmdServer();
        String host = "rmi://127.0.0.1:1099/";
        Naming.rebind(host+"Cmd", cmdServer);
    }
}
