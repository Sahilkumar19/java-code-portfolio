package com.simplestcodings;

public class Threding {
    public static void main(String[] args) {
        multi o1=new multi();
//        o1.run();
//        o1.start();

        test o2=new test();
        Thread t1=new Thread(o2);
//        t1.run();
//        t1.start();

        A objA = new A();
        B objB = new B();
//        objA.start();
//        objB.start();
//        System.out.println(objA.getPriority());
//        objA.setPriority(10);
//        System.out.println(objA.getPriority());

//        Runnable objC = new A1();
//        Runnable objD = new B1();
//        Thread t2 = new Thread(objC);
//        Thread t3 = new Thread(objD);
//        t2.start();
//        t3.start();


        Runnable objE = new Runnable() {
            public void run() {
                for(int i=1;i<10;i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable objF = new Runnable() {
            public void run() {
                for(int i=1;i<10;i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
//        Thread t4 = new Thread(objE);
//        Thread t5 = new Thread(objF);
//        t4.start();
//        t5.start();

        Runnable objG = ()-> {
            {
                Integer x = 10;
                System.out.println("Is x integer:" + true);
                for(int i=1;i<10;i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable objH = ()->{ {
            Integer y= 10;
            System.out.println("Y is member of: "+y.getClass());
            for(int i=1;i<10;i++) {

                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        };
        Thread t6 = new Thread(objA);
        Thread t7 = new Thread(objB);
        t6.start();
        t7.start();
    }
}

//Threading using the Extending the Thread Class
class multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
}

//Thread using implementing the Runnable interface
class test implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

}

class A extends Thread{
    public void run() {
        for(int i=1;i<100;i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("hello");
        }
    }
}

class A1 implements Runnable{
    public void run() {
        for(int i=1;i<10;i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B1 implements Runnable{
    public void run() {
        for(int i=1;i<10;i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}