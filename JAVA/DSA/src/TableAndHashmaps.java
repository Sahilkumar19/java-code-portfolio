import java.util.HashMap;
import java.util.HashSet;

public class TableAndHashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer>map=new HashMap<String, Integer>();
        map.put("Sahil",89);
        map.put("ajeet",99);
        map.put("arun",94);
//        System.out.println(map.get("Sahil"));
        HashSet<Integer>set=new HashSet<>();
        set.add(55);
        set.add(0);
        set.add(109);
        set.add(23);
        set.add(23);
        set.add(56);
        System.out.println(set);
    }
}
