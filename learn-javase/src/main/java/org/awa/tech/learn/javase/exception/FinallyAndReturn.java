package org.awa.tech.learn.javase.exception;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/7/18.
 */
public class FinallyAndReturn {
    public static void main(String[] args) {


        double num = test();
        System.out.println(num);
    }

    public static double test(){
        double a = 20.0;
        double b = 2.0;
        try {
            a /= b;
            return a++;
        } catch (Exception e) {
            return 0;
        } finally {
            a += 100;
            System.out.println("finally:"+a);
            //程序提前退出，返回结果不是try或catch中保存的返回值
            //return a;
        }
    }

}
