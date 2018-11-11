package com.RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IHelloServiceImpl extends UnicastRemoteObject implements IHelloService {

    protected IHelloServiceImpl() throws RemoteException {
        super();
    }

    public void sayHello(String msg)throws RemoteException {
        System.out.println("客户端对服务器说：" + msg);
    }
}
