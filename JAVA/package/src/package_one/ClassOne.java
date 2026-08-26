//Package in Java is a mechanism to encapsulate a group of classes, sub packages and
//interfaces. Packages are used for:
package package_one;
class student{
    int age;
    public String tooString(){
        return "hiii";
    }
    public int hashCode(){
        return 54;
    }
}
public class ClassOne {
    public void methodClassOne(){
        System.out.println("hello its class one");
    }
//    public
    public static void main(String[] args) {
        student s1=new student();
//        s1.notify();
        System.out.println(s1);
        System.out.println(s1.tooString());
//        System.out.println(s1.id);
        System.out.println(s1.hashCode());
//        System.out.println();
        student s2=new student();
        student s3=s1;
        s1.age=18;
        s2.age=18;
        System.out.println("s1 equals s2 "+s1.equals(s2));
        System.out.println("s1 equals s3 "+s1.equals(s3));
        System.out.println(s3.age);
        s3.age=23;
        System.out.println(s1.age);
        System.out.println(s1.getClass());
    }
}
