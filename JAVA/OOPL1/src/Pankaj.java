public class Pankaj {
    static int y=9;
//    int i=0;

    public static void main(String[] args) {
//        y=10;
//        System.out.println(y);
//        System.out.println(y);
//        A static method can access only static data
//        System.out.println(i); // so this i can not be accessed here because it is not static
        Pankaj obj1=new Pankaj();
        obj1.method();
        System.out.println(Pankaj.y);
        System.out.println(y);
    }
    void method(){
        y=10;
    }
}
