import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface INF1{
    default void show(){
//        System.out.println("sahil");
    }
}
class Concrete1 implements INF1{
}
public class Selection {
    public static void main(String[] args) {
        Concrete1 c1 = new Concrete1();
        c1.show();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al2.add(i);
            al1.add(i + 1);
        }
//        List<Integer> list=new ArrayList<Integer>();
//        al1.add(0);
//        System.out.println(al2.retainAll(al1));true if the list was modified as a result of this operation.
//false if the list was not modified as a result of this operation.
//        System.out.println(al2);
//        System.out.println(al1);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Get an iterator for the ArrayList
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println(iterator);

        // Iterate through the ArrayList using the iterator
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
