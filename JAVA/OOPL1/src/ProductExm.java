public class ProductExm {
    public static void main(String[] args) {
        Product obj=new Product();
        int p1=obj.Multiply(3,8);
        System.out.println(p1);
        int p2= obj.Multiply(1,2,3);
        System.out.println(p2);

        Product2 obj2=new Product2();
        double p3=obj2.Multiply(1,3,5);
//        System.out.println(p3);
        int p4=obj2.Multiply(9,8,7);
//        System.out.println(p4);
//        StudentDetails s1=new StudentDetails();
//        s1.details(12,"Sahil");
//        s1.details("Deepanshika",87);
        OverloadingCalculation1 ob=new OverloadingCalculation1();
        ob.sum(20,20);//second int literal promoted to long
        ob.sum(6,9,0);
//        OverloadingCalculation2 ob1=new OverloadingCalculation2();
//        ob1.sum(12,34);
//        ob1.sum(23,23);
        OverloadingCalculation3 ob2=new OverloadingCalculation3();
//        ob2.sum(12,6);//now ambiguity
        Box2 b1=new Box2();
//        System.out.println(b1.depth);
        Box2 b2=new Box2(8);
//        System.out.println(b2.depth);
//        System.out.println(b2.Volume());
        Box2 b3=new Box2(12,3,6);
//        System.out.println(b3.height);


//        Test ob5 = new Test(2);
//        Test ob6;
//        ob6 = ob5.incrByTen();
//        System.out.println("ob1.a: " + ob5.a);
//        System.out.println("ob2.a: " + ob6.a);


    }

}



//changing the number of parameters

class Product{
    public int Multiply(int x,int y){
        return x*y;
    }
    public int Multiply(int x, int y, int z){
        return x*y*z;
    }
}
//changing the data type of the argument
class Product2{
    public int Multiply(int a,int b, int c){
        return a*b*c;
    }
    public double Multiply(double a, double b, double c){
        return a*b*c;
    }
}

//changing the oreder of parameters of the methods

class StudentDetails{
    public void details(String name, int roll){
        System.out.println("Details are:"+" "+ "Name is:"+" "+name+" "+" "+"And Roll number is:"+" "+roll);
    }
    public void details(int roll,String name){
        System.out.println("Details are:"+" "+ "Name is:"+" "+name+" "+" "+"And Roll number is:"+" "+roll);
    }
}
//type conversion in method overloading
//small size datatype to high size datatype conversion is possible
// Byte-->Short-->int-->Long-->Float-->Double.

//Example of method overloading with type promotion

class OverloadingCalculation1{
    void sum(int a,long b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

//if there are matching type arguments type promotion is not performed
}
class OverloadingCalculation2{
    void sum(int a, int b){
        System.out.println("int arg invoked");

    }
    void sum(long a,long b){
        System.out.println("long arg invoked");
    }
}
class OverloadingCalculation3{
    void sum(int a, long b){
        System.out.println(a+b);
    }
    void sum(long a, int b){
        System.out.println(a+b);
    }
}

//Contructor Overloading
class Box2{
    double width,height,depth;
    //constructor used when all dimensions specified
    Box2(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    //constructor used when no dimensions specified
    Box2(){
        width=height=depth=0;
    }
    //constructor used when cube is created
    Box2(double len){
        width=height=depth=len;
    }
    double Volume(){
        return width*height*depth;
    }


}
// Returning an object.
class Test {
    int a;
    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }
}
