package org.awa.tech.learn.javase.coin;

/**
 * DESCRIPTION
 * Created by wb-lyw190343 on 2017/7/14.
 */
public class SwitchTest {

    public static void main(String[] args) {

        String sex = "男";

        switch (sex){
            case "男":
                System.out.println("男的");
            case "女":
                System.out.println("女的");
                default:
            System.out.println("第三性别");
        }

    }


}
