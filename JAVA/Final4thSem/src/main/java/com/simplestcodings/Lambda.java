package com.simplestcodings;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Drawable{
    public void draw();
}
public class Lambda {
    public static void main(String[] args) {
        int width=10;
//        implementing the interface without lambda expression

//        Drawable d=new Drawable() {
//            public void draw(){
//                System.out.println("drawing"+width);
//            }
//        };
//        d.draw();

//        java lambda expression

        Drawable d2=()->{
            System.out.println("drawing"+" "+width);
        };
        d2.draw();

        addition ad1=(int a,int b)->(a+b);
        System.out.println(ad1.add(12,13));
        addition ad2=(int n1,int n2)->{
            return (n1+n2);
        };
        System.out.println(ad2.add(1,3));


//        for each loop
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("sahil");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n)-> System.out.println(n)
        );
        info ob=()->{
            System.out.println("my name is sahil kumar");
            System.out.println("I am sophomore at sitare ");
            System.out.println("currently i am having my exams");
        };
        ob.myInfo();


//        Creating Thread using java.lang.Runnable interface
//        Thread example without lambda
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

//        Thread with lambda expression
        Runnable r2=()->{
            System.out.println("thread 2 is running");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
interface addition{
    int add(int a,int b);
}
interface info{
    void myInfo();
}
//Creating thread

