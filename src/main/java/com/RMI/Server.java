package com.RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            IHelloService iHelloService = new IHelloServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1/Hello",iHelloService);
            System.out.println("服务启动成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
