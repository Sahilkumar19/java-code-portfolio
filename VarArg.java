import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(1,7,9,0,87,76,65,34);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo("sahil","ranjan","ajeet","raushan","kirtan","shivam","bug");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println("HELLO WORLD");

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

}
