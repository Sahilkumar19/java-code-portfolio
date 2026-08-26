/*
soap=20
oil=100
shampoo=200
water=15
sanitiser=50
print them key value pair in increasing order of price
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("soap",50);
        hashMap.put("oil",100);
        hashMap.put("shampoo",200);
        hashMap.put("water",15);
        hashMap.put("sanitiser",50);
        System.out.println(hashMap);
        List<Integer> list = new ArrayList<>(hashMap.values());
        System.out.println(list);
    }
}
