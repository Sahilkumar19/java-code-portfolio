public class Inheritance {
    public static void main(String[] args) {
        Prorammer e=new Prorammer();
        System.out.println("salary:"+" "+e.salary+" "+"bonus"+" "+e.bonus);
//        Dog d=new Dog();
//        d.bark();
//        d.eat();
//        babydag bd=new babydag();
//        bd.weep();
//        bd.bark();
//        bd.eat();
        littledog ld=new littledog();
//        ld.eat();
//        ld.bark();
//        ld.weep();
//        ld.crying();
//        Student s1=new Student();
//        int roll= s1.rno;
//        System.out.println(s1.rno);
//        System.out.println(s1.rno(3));
//        B obj_B = new B();
//        obj_B.print_A1();
//        obj_B.print_B();
//
//        C obj_C = new C();
//        obj_C.print_A1();
//        obj_C.print_C();
//
//        D obj_D = new D();
//        obj_D.print_A1();
//        obj_D.print_D();
        Child c1=new Child();
        c1.num1=3;
        c1.num2=4;
        c1.Statement();
        c1.summation();
    }
}
class Employee{
    int salary=6000;
//    private int num;
}
class Prorammer extends Employee{
    int bonus=10000;
}
class Person{
    void name(String name){
        System.out.println("name is:"+" "+name);

    }

}
class student extends Person{
    void rollno(int num){
        System.out.println("roll numberis:"+" "+num);

    }

}



// single inheritance
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("bark");
    }

}
//multilavel inheritance
class babydag extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
class littledog extends babydag{
    void crying(){
        System.out.println("crying");
    }
}
// Hierarchical inheritance

class A1 {
    public void print_A1(){
        System.out.println("I am Class A,your parent class");
    }
}

class B extends A1 {
    public void print_B() {
        System.out.println("Class B");
    }
}

class C extends A1 {
    public void print_C() {
        System.out.println("Class C");
    }
}

class D extends A1 {
    public void print_D() {
        System.out.println("Class D");
    }
}

//multiple inheritance
class A2{
    void msg(){
        System.out.println("hello");
    }
}
class B2{
    void msg(){
        System.out.println("hello world");
    }
}
//class C2 extends A2,B2{
//    public static void main(String[] args) {
//        System.out.println("hell all");
//    }
//
//}
// write a program to calculate the sum of twonumbers using single inheritance

// the sum is:
//one of the var in super class
//othe will be in subclass
// the statement the sum is : will be in super class

class sum{
    int num1;
    void Statement(){
        System.out.print("the sum is:");
    }
}
class Child extends sum{
    int num2;
    void summation(){
        System.out.println(num1+num2);
    }
}





