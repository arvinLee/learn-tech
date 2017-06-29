package org.awa.tech.learn.design.pattern.proxy.virtual;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by lisa on 2017/6/29.
 */
public class GetDocByNet implements GetDocFacade{
    public String getDoc(String url) {
        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpUriRequest request = new HttpGet(url);
            HttpResponse response = client.execute(request);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
