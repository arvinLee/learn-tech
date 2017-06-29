package org.awa.tech.learn.design.pattern.proxy.remote.impl;

import org.awa.tech.learn.design.pattern.model.Employee;
import org.awa.tech.learn.design.pattern.proxy.remote.EmployeeRemoteService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/6/29.
 */
public class EmployeeRemoteServiceImpl extends UnicastRemoteObject implements EmployeeRemoteService{

    public EmployeeRemoteServiceImpl() throws RemoteException {
        super();
    }

    public Employee getEmpById(Long id) {

        Employee employee = new Employee();
        employee.setSex("女");
        employee.setBirthDay(new Date(1989,9,29));
        employee.setName("李亚文");

        return employee;
    }
}
