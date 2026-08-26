public class Overriding {
    public static void main(String[] args) {
//        System.out.println(Class1.Multiply(9, 5));
//        System.out.println(Class1.Multiply(6, 5, 4));
        Class2 obj=new Class2();
        obj.print();
        obj=new child1();
        obj.print();
        obj=new child2();
        obj.print();
//
//        other obj2=new other();
//        obj2.print();


    }
}
//compile time polymorphism

class Class1 {
    static int Multiply(int num1, int num2)
    {
        return num1 * num2;
    }
    static int Multiply(int num1, int num2, int num3)
    {
        return num1 * num2 * num3;
    }
}
//write a program that shows runtime polymorphism
//write a program that have same output but without any polymorphism and any inheritance
class Class2{
    void print(){
        System.out.println("hello i am parent class");
    }

}
class child1 extends Class2{
    void print(){
        System.out.println("hello i am child1");
    }
}
class child2 extends Class2{
    void print(){
        System.out.println("hello i am child2");
    }
}
class other{
    void print(){
        System.out.println("hello i am parent class");
        System.out.println("hello i am child1");
        System.out.println("hello i am child2");
    }
}

















