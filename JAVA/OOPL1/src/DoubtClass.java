public class DoubtClass {
    public static String s1 = "sahil";
    public static void main(String[] args) {
        Contant obj1=new Contant();
        Contant obj2=new Contant();
//        we can reassign the variables
        obj1.i=8;
        obj2.i=9;
        //        we can not assign a value to a final variable
//        obj3.max_p=9;

//        System.out.println(obj1.i);
//        System.out.println(obj2.i);
//        System.out.println(Contant.max_p);
//        Student2 s1=new Student2();
//        s1.Setvalue(5);
//        Student2 s2= new Student2(3);
        System.out.println(DoubtClass.s1);
        System.out.println(StaticVar.s1);
//        System.out.println(StaticVar.s1);
        for (int i = 0; i < 3; i++) {
            String msg="iteration";
//            System.out.println(msg);
        }
//        System.out.println(msg);



    }


}
class StaticVar{
//    declare static vaiable
//    for static we can not have multiple object
    public static String s1 = "sagar";

    public static void main(String[] args) {
//        System.out.println(StaticVar.s1);
//        can not declare static var inside the main method
//        static int=0;
    }



}
class Contant{
    int i=6;
    public static final int max_p=20;
//    it can not be changed


}
class Student2{
    int i;
    int y;
    void Setvalue(int x){
        i=x;
        System.out.println(i);
    }
    Student2(int y){
        i=y;
        System.out.println(i);
    }



}
