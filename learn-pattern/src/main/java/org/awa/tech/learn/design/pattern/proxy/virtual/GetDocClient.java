package org.awa.tech.learn.design.pattern.proxy.virtual;

/**
 * Created by lisa on 2017/6/29.
 */
public class GetDocClient {

    public static void main(String[] args) {

        GetDocFacade service = new GetDocByNet();
        GetDocFacade proxy = new GetDocProxy(service);
        String doc = proxy.getDoc("https://stackoverflow.com");
        rePrint(doc);

        System.out.println("come on....");
    }

    public static void rePrint(String doc){
        System.out.println("the response is : "+doc);
    }
}
