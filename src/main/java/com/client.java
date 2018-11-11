package com;

import com.RMI.IHelloService;
import com.RMI.IHelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 基于本地的调用
 */
public class client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        IHelloService iHelloService = null;
        try {
            iHelloService = (IHelloService) Naming.lookup("rmi://127.0.0.1/Hello");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        iHelloService.sayHello("今天天气真好");
    }
}
