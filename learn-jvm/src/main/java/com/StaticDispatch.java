package com;

/**
 * @author lipengcheng3 Created date 2019-03-20 16:14
 */
public class StaticDispatch {
    static abstract class Human{

    }
    static class Man extends Human{

    }
    static class Woman extends Human{

    }

//    public static void sayHello(Human x){
//        System.out.println("hello,human");
//    }

    public static void sayHello(Man x){
        System.out.println("hello,Man");
    }

    public static void sayHello(Woman x){
        System.out.println("hello,Woman");
    }

    public static void main(String[] args){
        Human man = new Man();
        Human woman = new Woman();

//        sayHello(man);
//        sayHello(woman);
    }
}
