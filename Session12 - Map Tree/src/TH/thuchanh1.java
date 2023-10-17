package TH;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class thuchanh1 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nguyễn Văn B", 20);
        hashMap.put("Nguyễn Văn D", 18);
        hashMap.put("Nguyễn Văn A", 25);
        hashMap.put("Nguyễn Văn C", 21);
        System.out.println("In ra hashMap: ");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("In ra treeMap: ");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Nguyễn Văn G", 24);
        linkedHashMap.put("Nguyễn Văn F", 22);
        linkedHashMap.put("Nguyễn Văn H", 10);
        System.out.println("In ra linkedHashMap: ");
        System.out.println(linkedHashMap);
        System.out.println("Tuổi của Nguyễn Văn F: " + linkedHashMap.get("Nguyễn Văn F"));
    }
}
