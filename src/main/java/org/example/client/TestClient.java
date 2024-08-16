package org.example.client;

import org.example.remoteInterface.DangeriousFunc1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestClient {
    public static void main(String[] args) {
        try {
            // 获取RMI注册表（假设服务器运行在本地，端口1099）
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // 查找远程对象
            DangeriousFunc1 stub = (DangeriousFunc1) registry.lookup("Hello");

            // 调用远程方法
            stub.exec("calc.exe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
