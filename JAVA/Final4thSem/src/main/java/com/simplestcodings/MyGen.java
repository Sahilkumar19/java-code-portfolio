package com.simplestcodings;

public class MyGen {
    public static void main(String[] args) {
        Gen<Integer> m=new Gen<Integer>();
        m.add(2);
//        m.add("vivek");
//        System.out.println(m.get());
        Integer[] arr={10,20,30,40};
        Character[] chararr={'a','b','d','n'};
        System.out.println("integer array");
        printArray(arr);
        System.out.println("char array");
        printArray(chararr);
    }
    public static <E> void printArray(E[] arr){
        for (E ele: arr) {
            System.out.println(ele);
        }
        System.out.println();
    }
}
class Gen<T>{
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}
