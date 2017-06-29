package org.awa.tech.learn.design.pattern.proxy.remote;

import org.awa.tech.learn.design.pattern.model.Employee;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/6/29.
 */
public interface EmployeeRemoteService extends Remote{

    Employee getEmpById(Long id) throws RemoteException;

}
