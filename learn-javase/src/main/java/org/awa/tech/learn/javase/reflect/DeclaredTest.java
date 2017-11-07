package org.awa.tech.learn.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by lisa on 2017/8/9.
 */
public class DeclaredTest {


    public static void main(String[] args) throws IllegalAccessException {

        Person person = new Person("tom");
        Student student = new Student();
        student.setLevel("4");

        for (Field filed : Person.class.getDeclaredFields()){
            System.out.println("Person declared filed:"+filed.getName());
//            filed.get(person);

        }


        for (Field filed : Person.class.getFields()){
            System.out.println("Person filed:"+filed.getName());
        }


        for (Field filed : Student.class.getDeclaredFields()){
            System.out.println("Student declared filed:"+filed.getName());

        }

        for (Field filed : Student.class.getFields()){
            System.out.println("Student filed:"+filed.getName());
        }

    }

}
