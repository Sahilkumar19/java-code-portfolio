public class VariablesTypes {
    int i1=9;
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2=new Demo();
        Demo.j=90;
        System.out.println(Demo.j);

//        System.out.println(obj1.setvalue(7));
//        obj1.setvalue(6);
        obj1.j=4;
        obj2.j=9;
        int i1=10;
        System.out.println(i1);
//if we create another object and change the value of static variable it will change for all the objects
        System.out.println(obj1.j);

        System.out.println(obj2.j);
        //we can not change the variable which have been finalised
//        cannot assign a value to final variable num
//        Demo.num=9;
//        System.out.println(Demo.num);
//        obj1.Demo1(7);
        obj1.i=8;//instance vaiable
//        System.out.println(obj1.i);
        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
        }
//        System.out.println(i);

    }

}
class Demo{
    static int j;
    int i;//local variables
    int y;
    public static final int num=8;
    void setvalue(int x){
        i=x;
//        System.out.println(i);
    }
    void  Demo1(int t){
        int number;
        i=t;
//        System.out.println(i);
    }
}
