package com.simplestcodings;

public class Wrapping {
    public static void main(String[] args) {
        int a =20;
        Integer i=Integer.valueOf(a);//converting int to Integer explicitly
        Integer j=a;//autoboxing
        System.out.println(a+" "+i+" "+j);

        Integer b=new Integer(3);
        int in=b.intValue(); //converting explicitly Integer to int
        int inn=b;//unboxing
        System.out.println(b+" "+in+" "+inn);
    }
}
