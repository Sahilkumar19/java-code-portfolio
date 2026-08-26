package com.simplestcodings;

public class Queue {
    int size=5;
    int[] item=new int[size];
    int front,rear;
    Queue(){
        front=-1;
        rear=-1;
    }
    public boolean isEmpty(){
        return (front==-1);
    }
    public boolean isFull(){
        if (front==0 && rear==size-1){
            return true;
        }
        return false;
    }
    void enQueue(int e){
        if (!isFull()){
            rear++;
            item[rear]=e;
        }else {
            System.out.println("queue is full");
        }
    }
//    int deQueue(){
//
//    }
}
