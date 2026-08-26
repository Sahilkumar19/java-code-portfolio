import java.io.File;
import java.util.Scanner;

public class FileReaderCommandLine {
    public static void main(String[] args) throws Exception{
        File folder = new File(args[0]);
        File[] listOfFiles=folder.listFiles();
        String content="";
        for (File file: listOfFiles) {
            if (file.isFile()){
                File myFile= new File(file.getAbsolutePath());
                Scanner sc=new Scanner(myFile);
                while (sc.hasNextLine()){
                    content=content+sc.nextLine()+"";
                }
                System.out.println("File name: "+file.getName());
                System.out.println("Content: "+content.trim());
            }
            content="";
        }
    }
}
