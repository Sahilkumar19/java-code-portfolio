///*
//Uses of all self implemented package
//How to run this?
//------> go to the right directory which contains this main class and all the packages
//------> compile the main class by typing javac main.java
//------> after compilation type java main
//Author : Sahil Kumar
//Date : 6/03/2024
// */
//import Searching.*;
//import Sorting.*;
//import Stack.*;
//import Queue.*;
//import LinkedList.*;
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.println("What do you want to do?\n1. Searching \n2. Sorting \n3. Stack \n4. Queue \n5. LinkedList");
////        System.out.println();
//        int select = in.nextInt();
//        System.out.println();
//        if (select==1){
//            System.out.println("you have chosen Searching so now you have two options \n1. Binary Search \n2. Linear Search");
//            System.out.println("which one you want to choose?");
//            int chose = in.nextInt();
//            if (chose==1){
//                System.out.println("you have chosen for Binary search");
//                System.out.println("you have to enter the number in either in increasing or decreasing order");
//                System.out.println("enter the size of the array");
//                int size=in.nextInt();
//                int[] arr=new int[size];
//                for (int i = 0; i < size; i++) {
//                    System.out.println("enter number to put in the array:");
//                    int num = in.nextInt();
//                    arr[i]=num;
//                }
//                System.out.println("you have this array "+Arrays.toString(arr));
//                System.out.println();
//                System.out.println("enter the target you want to search for:");
//                int target=in.nextInt();
//                int indx = SeachingImplementation.OrderAgnosticBS(arr,target);
//                System.out.println("the target is found at index "+indx);
//            }
//            else {
//                System.out.println("you have chosen for the Linear search so now you can put numbers in array randomly");
//                System.out.println();
//                System.out.println("enter the size of the array:");
//                int size = in.nextInt();
//                int[] arr = new int[size];
//                for (int i = 0; i < size; i++) {
//                    System.out.println("enter the number to put into the array");
//                    int num = in.nextInt();
//                    arr[i]=num;
//                }
//                System.out.println("you have this array "+ Arrays.toString(arr));
//                System.out.println();
//                System.out.println("Now enter the target to search for:");
//                int target=in.nextInt();
//                int indx = SeachingImplementation.LinearSearch(arr,target);
//                System.out.println("the target is found at index "+indx);
//            }
//        }
//        if (select==2){
//            System.out.println("You have chosen for Sorting");
//            System.out.println("So enter the size of the array");
//            int size=in.nextInt();
//            int[] arr=new int[size];
//            for (int i = 0; i < size; i++) {
//                System.out.print("enter the number in the array:");
//                int num=in.nextInt();
//                arr[i]=num;
//            }
//            System.out.println();
//            System.out.println("Now you have this array: "+ Arrays.toString(arr));
//            System.out.println();
//            System.out.println("In sorting you can sort array using the following sorting algorithms \n1. Bubble Sort \n2. Insertion Sort \n3. Selection Sort \n4. Quick Sort \n5. MergeSort");
//            System.out.println("which one you want to choose?");
//            int chose=in.nextInt();
//            if (chose==1){
//                System.out.println("you have chosen the bubble sort");
//                System.out.println("The sorted array using bubble sort is: "+ Arrays.toString(SortingAlgosImplementation.BubbleSort(arr)));
//            } else if (chose==2) {
//                System.out.println("you have chosen for the insertion sort");
//                System.out.println("The sorted array using insertion sort is: "+ Arrays.toString(SortingAlgosImplementation.InsertionSort(arr)));
//            } else if (chose==3) {
//                System.out.println("you have chosen for the selection sort");
//                System.out.println("The sorted array using selection sort is: "+ Arrays.toString(SortingAlgosImplementation.SelectionSort(arr)));
//            } else if (chose==4) {
//                System.out.println("you have chosen for the quick sort");
//                System.out.println("The sorted array using quick sort is: "+ Arrays.toString(SortingAlgosImplementation.QuickSort(arr, 0, size-1)));
//            }else {
//                System.out.println("you have chosen for the merge sort");
//                System.out.println("The sorted array using merge sort is: "+ Arrays.toString(SortingAlgosImplementation.MergeSort(arr, 0, size - 1)));
//            }
//        }
//        if (select==3){
//            System.out.println("you have chosen for the stack so first you need to make a stack");
//            System.out.println("so what size of stack you want? enter a number :");
//            int size = in.nextInt();
//            CustomStack s1 = new CustomStack(size);
//            while (!s1.isFull()){
//                System.out.println("enter a number to push in the :");
//                int e = in.nextInt();
//                s1.push(e);
//            }
//            System.out.println("Now you have the stack and you have the following operations in the stack \n1. pop \n2. peek \n3. isFull \n4. isEmpty");
//            System.out.println("enter number corresponding to the operation you want to perform on stack");
//            int num = in.nextInt();
//            if (num==1){
//                System.out.println("you have chosen for the pop operation so the popped number is");
//                System.out.println(s1.pop());
//            }
//            else if (num==2){
//                System.out.println("you have chosen for the peek operation so the first number in the stack is");
//                System.out.println(s1.peek());
//            }else if (num==3) {
//                System.out.println("you wanted to see whether the stack is full or not");
//                System.out.println(s1.isFull());
//            }
//            else {
//                System.out.println("you have chosen for the isEmpty operation");
//                System.out.println(s1.isEmpty());
//            }
//        }
//        if (select==4){
//            System.out.println("you have chosen for the queue so first you need to make a queue");
//            System.out.println();
//            System.out.println("so what will be the size of your queue? enter size");
//            System.out.println();
//            int size = in.nextInt();
//            System.out.println();
//            CustomQueue q1 = new CustomQueue(size);
//            System.out.println("Now you have the queue of the given size, so in order to see the operations in the queue you need to build this queue");
//            System.out.println();
//            while (!q1.isFull()){
//                System.out.println("enter a number to put in the queue");
//                int e = in.nextInt();
//                q1.insert(e);
//            }
//            q1.display();
//            System.out.println("now you have the queue so what operations you want to perform which are given below \n1. remove \n2. front \n3. isEmpty \n4. isFull \n5. display");
//            System.out.println("enter the corresponding number to the operation you want to perform");
//            int num = in.nextInt();
//            if (num==1){
//                System.out.println("you have chosen for remove operation");
//                System.out.println("removed element from the queue is "+q1.remove());
//                System.out.println("now the queue is ");
//                q1.display();
//            } else if (num==2) {
//                System.out.println("you have chosen for the front operation");
//                System.out.println("front element of the queue is "+q1.front());
//                System.out.println("now the queue is");
//                q1.display();
//            } else if (num==3) {
//                System.out.println("you have chosen for the isEmpty operation");
//                System.out.println("the output of isEmpty operation is "+q1.isEmpty());
//            } else if (num==4) {
//                System.out.println("you have chosen for the isFull operation of the queue");
//                System.out.println("the output of the isFull operation of the queue is "+q1.isFull());
//            }
//            else {
//                System.out.println("you have chosen for the display operation");
//                System.out.println("the display of the queue is");
//                q1.display();
//            }
//        }
//        if (select==5){
//            System.out.println("you have chosen for the LinkedList so first you need to make a linked list in order to perform the operations");
//            System.out.println("enter the size of the linked list");
//            int size = in.nextInt();
//            CustomLinkedList ll1 = new CustomLinkedList();
//            while (size>0){
//                System.out.println("enter a number to insert in the array");
//                int e = in.nextInt();
//                ll1.insertFirst(e);
//                size-=1;
//            }
//            System.out.println("now you have this linked list");
//            ll1.display();
//            System.out.println("Now you have the following operations to perform \n1. insertFirst \n2. insertLast \n3. insert \n4. deleteLast \n5. delete \n6. find \n7. get \n8. deleteFirst \n9. display");
//            System.out.println("choose one of the above operation to perform");
//            int choice = in.nextInt();
//            if (choice==1){
////                System.out.println();
//                System.out.println("you have chosen for the insertFirst operation");
//                System.out.println("enter a number to insert at first");
//                int num = in.nextInt();
//                ll1.insertFirst(num);
//                System.out.println("after this operation your linked list look like this");
//                ll1.display();
//            } else if (choice==2) {
//                System.out.println("you have chosen for the insertLast operation");
//                System.out.println("enter a number to insert at last");
//                int num = in.nextInt();
//                ll1.insertLast(num);
//                System.out.println("after this operation your linked list look like this");
//                ll1.display();
//            } else if (choice==3) {
//                System.out.println("you have chosen for the insert operation");
//                System.out.println("enter a number to insert");
//                int num = in.nextInt();
//                System.out.println("enter index you want to insert this number");
//                int indx = in.nextInt();
//                ll1.insert(num,indx);
//                System.out.println("after this operation your linked list look like this");
//                ll1.display();
//            } else if (choice==4) {
//                System.out.println("you have chosen for the deleteLast operation");
//                ll1.deleteLast();
//                System.out.println("so after deleting the last element your linked list look like this");
//                ll1.display();
//            } else if (choice==5) {
//                System.out.println("you have chosen for the delete operation");
//                System.out.println("enter the index of the number you want to delete");
//                int indx = in.nextInt();
//                ll1.delete(indx);
//                System.out.println("after deleting the number at that index your linked list look like this");
//                ll1.display();
//            } else if (choice==6) {
//                System.out.println("you have chosen for the find operation");
//                System.out.println("enter the number you want to find");
//                int num = in.nextInt();
//                System.out.println("the number is found at index "+ll1.find(num));
//            } else if (choice==7) {
//                System.out.println("you have chosen for the get operation");
//                System.out.println("enter the index which value you want to get");
//                int indx = in.nextInt();
//                System.out.println("the number at this index is "+ll1.get(indx));
//            } else if (choice==8) {
//                System.out.println("you have chosen for the deleteFirst operation");
//                ll1.deleteFirst();
//                System.out.println("after deleting the first your linked list will look like this");
//                ll1.display();
//            }else {
//                System.out.println("you have chosen for the display operation");
//                ll1.display();
//            }
//        }
//    }
//}
