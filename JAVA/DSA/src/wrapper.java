public class wrapper {
    public static void main(String[] args) {
        wrapperclass(20);
        student s=new student();
        System.out.println(s);
//        System.out.println(s.toString());
        System.out.println(s.hashCode());
    }
    public static void wrapperclass(int n){
        int a =n;
        Integer i=Integer.valueOf(a);
        Integer j = a;
//        System.out.println(a+" "+i+" "+j);
//        Integer k=new Integer(n);
    }
}
class student{
    public String toString() {
        return "s";
    }
}
class Parrot{
    String name;
}
