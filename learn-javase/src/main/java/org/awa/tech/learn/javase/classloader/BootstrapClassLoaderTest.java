package org.awa.tech.learn.javase.classloader;

import java.net.URL;

/**
 * Created by lisa on 2017/7/29.
 */
public class BootstrapClassLoaderTest {

    public static void main(String[] args) {
        URL[] urls =  sun.misc.Launcher.getBootstrapClassPath().getURLs();

        for(URL uri : urls){
            System.out.println(uri);
        }

        System.out.println(System.getProperty("sun.boot.class.path"));
    }
}
