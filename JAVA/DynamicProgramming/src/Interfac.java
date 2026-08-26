import java.io.File;
import java.util.Scanner;

//import java.io.*;
public class Interfac {
}
//a simple interface
interface In1{
    final int a=10;
    void display();

}
//a class that implements the interface
class testclass implements In1{
    public void display(){
        System.out.println("i am a method in interface 1 implemented in testclass");
    }
    public static void main(String[] args) {
        testclass t=new testclass();
        t.display();
        System.out.println(a);
    }
}

//multiple inheritance

// Interface 1
interface API {
    // Default method
    default void show()
    {
// Print statement
        System.out.println("Default API");
    }
}

// Interface 2
// Extending the above interface
interface Interface2 extends API {
    // Abstract method
    void display();
}
// Interface 3
// Extending the above interface
interface Interface3 extends API {
    // Abstract method
    void print();
}
// Main class
// Implementation class code
class TestClass implements Interface2, Interface3 {
    // Overriding the abstract method from Interface2
    public void display(){
        System.out.println("Display from Interface2");
    }
    // Overriding the abstract method from Interface3
    public void print(){
        System.out.println("Print from Interface3");
    }
    // Main driver method
    public static void main(String args[]){
// Creating object of this class
// in main() method
        TestClass d = new TestClass();
// Now calling the methods from both the interfaces
        d.show(); // Default method from API
        d.display(); // Overridden method from Interface2
        d.print(); // Overridden method from Interface3
    }
}

interface API2{
    default void show(){
        System.out.println("default api");
    }
}
interface in1 extends API2{
    int countFiles(String s);
}
interface in2 extends API2{
    void showContent(String s);
}
class testclass2 implements in1,in2{
    public int countFiles(String s){
        int count=0;
        File folder=new File(s);
        File[] listOfFiles=folder.listFiles();
        for (File file: listOfFiles) {
            if (file.isFile()){
                showContent(file.getAbsolutePath());
                count++;
            }
        }
        return count;
    }
    public void showContent(String s){
        File file=new File(s);
        String content="";
        try{
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()){
                String str=sc.nextLine();
                content=content+str+" ";
            }
            System.out.println("file:    "+s+"\ncontent:"+content.trim()+"\n");
            sc.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        testclass2 d=new testclass2();

    }

}