import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
    }
}
class CreateFile {
    public static void main(String[] args) throws IOException {
// Accept a string
        String str = "File Handling in Java using "+
                " FileWriter and FileReader";
// attach a file to FileWriter
        FileWriter fw=new FileWriter("Newfile.txt");
// read character wise from string and write
// into FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Writing successful");
//close the file
        fw.close();
    }
}
//class MainClass {
//    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("file.txt");
//        int i;
//        while((i=fr.read())!=-1)
//            System.out.print((char)i);
//        fr.close();
//    }
//}
class MainClass {
    public static void main(String args[]) throws IOException {
//creating File instance to reference text file in Java
        File text = new File("C:\\Users\\Aman\\Desktop\\Pintu\\Java\\Week_09\\EH2.txt");
//Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
//Reading each line of the file using Scanner class
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println(line);
        }
    }
}
class P1{
    public static void main(String[] args) throws IOException {
        File text=new File("Newfile.txt");
        Scanner inp=new Scanner(text);
        int cntv=0;
        int cc=0;
        String Ll="";
        while (inp.hasNextLine()){
            String l=inp.nextLine();
            Ll=l.toLowerCase();
//            System.out.println(Ll);
            for (int i = 0; i < l.length(); i++) {
                if (Ll.charAt(i)=='a'|| Ll.charAt(i)=='e'||Ll.charAt(i)=='i'||Ll.charAt(i)=='o'||Ll.charAt(i)=='u') {
                    cntv++;
                }
                else {
                    if ((int) Ll.charAt(i)<=122 && 97<=(int) Ll.charAt(i)){
                        cc++;
                    }
                }

            }
        }
        System.out.println(cntv);
        System.out.println(cc);
    }
}
class MainClass2 {
    public static void main(String args[]) throws IOException {

//creating File instance to reference text file in Java
        File text = new File("Newfile.txt");
//Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
        String revLine="";
        String orgLine="";
        ArrayList<String> strList; //= new ArrayList<String>();
//Reading each line of the file using Scanner class
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            orgLine = orgLine + line;
//            System.out.println(orgLine);
            String[] wordArray = line.split(" ");
            for (int i=wordArray.length-1;i>=0;i--){
                revLine = revLine + wordArray[i]+" ";
            }
        }
        System.out.println("All texts:\n"+orgLine.trim()+"\n");
        System.out.println("Reversed texts:\n"+revLine.trim());
    }
}