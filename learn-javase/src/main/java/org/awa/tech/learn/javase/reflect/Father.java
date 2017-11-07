package org.awa.tech.learn.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by lisa on 2017/8/13.
 */
public class Father {


    public static class StepFather{
        private String name;

        public StepFather(){}
        public StepFather(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public class Child{
        private String sex;

        public Child(){}
        public Child(String sex){
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        for (Constructor constructor : StepFather.class.getDeclaredConstructors()){

            if(constructor.getParameterCount() == 1){
                StepFather stepFather = (StepFather) constructor.newInstance("steven");
                System.out.println(stepFather.getName());
            }

        }

//        Constructor<StepFather> test = StepFather.class.getConstructor(String[].class);
//        Constructor<?>[] tests = StepFather.class.getConstructors();

        Father father = new Father();

        Child.class.getConstructor(Father.class,String.class);

        for (Constructor constructor : Child.class.getDeclaredConstructors()){

            for(Class paramType : constructor.getParameterTypes()){
                System.out.println(paramType);
            }


            if(constructor.getParameterCount() == 2){
                Child stepFather = (Child) constructor.newInstance(father,"man");
                System.out.println(stepFather.getSex());
            }

        }
    }


}
