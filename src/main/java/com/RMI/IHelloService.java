package com.RMI;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote {
    void sayHello(String msg) throws NotBoundException, RemoteException;
}
