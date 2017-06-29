package org.awa.tech.learn.design.pattern.client;

import org.awa.tech.learn.design.pattern.model.Employee;
import org.awa.tech.learn.design.pattern.proxy.remote.EmployeeRemoteService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/6/29.
 */
public class EmployeeClient {

    public static void main(String[] args) {
        try {
            EmployeeRemoteService service = (EmployeeRemoteService) Naming.lookup("rmi://127.0.0.1/EmployeeRemoteService");
            Employee employee = service.getEmpById(11L);
            System.out.println(employee);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
