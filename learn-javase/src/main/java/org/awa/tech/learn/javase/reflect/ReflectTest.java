package org.awa.tech.learn.javase.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lisa on 2017/11/2.
 */
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        try {
            Method method = ReflectException.class.getDeclaredMethod("getPercentData",double.class,double.class);
            method.setAccessible(true);
            method.invoke(null,1.0,0.0);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
