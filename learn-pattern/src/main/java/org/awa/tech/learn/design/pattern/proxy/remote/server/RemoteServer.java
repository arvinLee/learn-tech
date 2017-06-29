package org.awa.tech.learn.design.pattern.proxy.remote.server;

import org.awa.tech.learn.design.pattern.proxy.remote.EmployeeRemoteService;
import org.awa.tech.learn.design.pattern.proxy.remote.impl.EmployeeRemoteServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/6/29.
 */
public class RemoteServer {

    public static void main(String[] args) {
        try {
            EmployeeRemoteService service = new EmployeeRemoteServiceImpl();
            Naming.bind("EmployeeRemoteService",service);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }

}
