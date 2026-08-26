import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        File text=new File("C:\\Users\\kumar\\Desktop\\filehandling.txt");
        Scanner inp=new Scanner(text);
//        System.out.println(inp);
        int cntv=0;
        int cc=0;
        String Ll="";
//        while (inp.hasNextLine()){
//            String line=inp.nextLine();
////            System.out.println(line.charAt(i));
//            System.out.println(line);
//        }
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
//        String Original="";
//        System.out.println(cntv);
//        System.out.println(cc);
//        while (inp.hasNextLine()){
//            String l=inp.nextLine();
////            Original=
//
//        }
//        String s="dfhgu";

        while (inp.hasNextLine()){
            String line=inp.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c1=line.charAt(i);
                if ((int) Ll.charAt(i)>122 && (int) Ll.charAt(i)<97){
                    line.replaceAll(" ","");
                    line.replaceAll(",","");
                    System.out.println(line);
                }
//                System.out.println(line);
            }
//            System.out.println(line);
        }
//        System.out.println(inp);

        //count the word frequency


    }
}