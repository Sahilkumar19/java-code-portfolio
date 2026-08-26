import java.util.HashMap;
public class HashMapIA2 {
    public static void main(String[] args) {
        HashMap<String,String> capitalcities=new HashMap<String,String>();
        //add keys and values(country,city)
        capitalcities.put("England","London");
        capitalcities.put("Germany","Berlin");
        capitalcities.put("Norway","Oslo");
        capitalcities.put("USA","WDC");
//        System.out.println(capitalcities);
//        System.out.println(capitalcities.get("England"));
//        capitalcities.remove("England");
//        System.out.println(capitalcities);
//        capitalcities.clear();
//        System.out.println(capitalcities);
//        System.out.println(capitalcities.size());
        for (String i : capitalcities.keySet()){
//            System.out.println("key: "+i+" "+"values:"+capitalcities.get(i));
        }
        capitalcities.put("England","MCG");
//        System.out.println(capitalcities);

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"amit");
        hm.put(101,"vijay");
        hm.put(102,"rahul");
        System.out.println("initial list of elements:");
        for (int i: hm.keySet()){
//            System.out.println(i+" "+hm.get(i));
        }
        System.out.println("updated list of elements");
        hm.replace(102,"gaurav");
        for (int i : hm.keySet()){
//            System.out.println(i+" "+hm.get(i));
        }
        System.out.println("updated list of elements");
        hm.replace(101,"vijay","ravi");
        for (int i:hm.keySet()){
            System.out.println(i+" "+hm.get(i));
        }
        System.out.println("updated list of elements");
        hm.replaceAll((k,v)->"sahil");
        for (int i: hm.keySet()){
            System.out.println(i+" "+hm.get(i));
        }
        HashMap<String,Integer> people=new HashMap<String,Integer>();
        people.put("john",32);
        people.put("steve",30);
        people.put("angie",33);
        for (String i:people.keySet()){
//            System.out.println("key: "+" "+i+" " +"value: "+people.get(i));
        }
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"mango");
        map.put(2,"apple");
        map.put(3,"mango");
        map.put(4,"grapes");

        System.out.println("iterating hashmap...");
        for (int i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }

}
