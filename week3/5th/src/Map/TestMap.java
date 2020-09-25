package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Aname",30);
        hashMap.put("Bname",31);
        hashMap.put("Cname",29);
        hashMap.put("Dname",29);
        hashMap.put("Ename",31);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");


        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending oder of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Aname",30);
        linkedHashMap.put("Bname",31);
        linkedHashMap.put("Cname",29);
        linkedHashMap.put("Dname",29);
        System.out.println("\nThe age of for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
