import java.util.ArrayList;
import java.util.Scanner;

public class Slides {

    public static void main(String[] args) {
//        System.out.println("\\hello\nhow\tare \"you\"?\\\\");
//        Circle obj1=new Circle(2.0);
//        System.out.println(obj1.getArea());
        Circle c1=new Circle();
        Circle c2=new Circle();
//        Static variables store values for the variables in a common memory location. Because of this
//        common location, if one object changes the value of a static variable, all objects of the same
//        class are affected.
        c1.radius =9.0;
        Person p=new Person();
        p.setAge(23);
//        System.out.println(p.getAge());
        Subclass obj1=new Subclass();
        boolean ans=obj1.isPrime(2016);
//        System.out.println(ans);
        ArrayList<Integer> a=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("enter number "+i);
            int num=input.nextInt();
            a.add(num);
        }
        prime o=new prime();
        o.isprime(a);
    }


}
class Circle{
    static double radius=1.0;
    Circle(){
    }
    Circle(double newR){
        radius=newR;
    }
    double getArea(){
        return radius*radius*3.14159;
    }
}
class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
}
class Parent {
    // Method to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Subclass extends Parent {
    // Overriding method to check if a year is a leap year
    public boolean isPrime(int year) {
        // Leap year check logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // Leap year
        } else {
            return false; // Not a leap year
        }
    }
}
class prime{
    int factors=0;
    void isprime(ArrayList<Integer> al){
        for (int s = 0; s < al.size(); s++) {
            int num=al.get(s);
            for (int c = 1; c <=num ; c++) {
                if (num%c==0){
                    factors++;
                }
            }
            if (factors>2){
                System.out.println("the number "+num+ " is not prime");
            }
            else{
                System.out.println("prime");
            }
            factors=0;
        }

    }
}
