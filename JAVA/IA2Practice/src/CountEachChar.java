import java.util.ArrayList;
import java.util.List;
public class CountEachChar {
    public static void main(String[] args) {
        String str="We are Sitare";
        List<String> list=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(String.valueOf(str.charAt(i)));
        }
        System.out.println(list);

    }
    public static void count(List list){
        int v=0;
        int s=0;
        int c=0;
    }


}
