package com.simplestcodings;

public class Stack {
    int max_size;
    int[] arr;
    int top;
    Stack(int max_size){
        this.max_size=max_size;
        this.arr=new int[max_size];
        this.top=-1;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (max_size-1==top);
    }
    public void push(int e){
        if (!isFull()){
            top++;
            arr[top]=e;
            System.out.println("pushed element is:"+ e);
        }else {
            System.out.println("stack is full");
        }
    }
    public int pop(){
        if (!isEmpty()){
            int popede=top;
            top--;
            return arr[popede];
        }else {
            System.out.println("stack is empty");
        }
        return -1;
    }
    public int peek(){
        if (!isEmpty()){
            return arr[top];
        }else {
            System.out.println("stack is empty");
            return -1;
        }

    }

    public static void main(String[] args) {
        Stack st=new Stack(4);
        st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.pop();
        st.pop();
    }
}
