import java.util.ArrayList;

public class Heeps {
    public static void main(String[] args) {
        Heap<Integer> heap=new Heap<>();
    }
}
//    Generics are particularly useful in situations where you want to create classes or methods
//    that can work with different data types without sacrificing type safety.

//Generics are often defined with type parameters, which are enclosed in angle brackets '<>'
// and are usually represented by single uppercase letters, such as T, E, or K. These type
// parameters act as placeholders for actual data types.
// we use T as the placeholder for the datatype we want to insert into our heap.
// its useful when we generalise the value of the datatype
class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second,temp);
    }
    private int parent(int index){
        return (index - 1)/2;
    }
    private int left(int index){
        return (index*2)+1;
    }
    private int right(int index) {
        return (index*2)+2;
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int p=parent(index);
        if (list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(p);
        }
    }
//    public void UpHeap(int index){
//        while (index>0){
//            int P=parent(index);
//            if (list.get(index).compareTo()list.get(P))
//        }
//    }
    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Removing from an empty heap");
        }
        T temp=list.get(0);
        T last= list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);

        if (left<list.size() && list.get(min).compareTo(list.get(left))>0){
            min=left;
        }
        if (right<list.size() && list.get(min).compareTo(list.get(right))>0){
            min=right;
        }
        if (min!=index){
            swap(min,index);
            downheap(min);
        }
    }
    public ArrayList<T >heapSort() throws Exception{
        ArrayList<T> data=new ArrayList<>();

        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;

    }
}
