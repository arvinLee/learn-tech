package org.awa.tech.learn.design.pattern.proxy.virtual;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Created by lisa on 2017/6/29.
 */
public class GetDocProxy implements GetDocFacade{

    private GetDocFacade service;

    private String doc;

    public GetDocProxy(GetDocFacade service){
        this.service = service;
    }

    public String getDoc(String url) {
        if(doc == null){
            doc =  "get doc ing.....";

            final String _url = url;

            new Thread(new Runnable() {
                public void run() {
                    doc = service.getDoc(_url);
                    GetDocClient.rePrint(doc);
                }
            }).start();
        }

        return doc;
    }

}
