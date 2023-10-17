import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> testMap = new HashMap<>();
        System.out.println(testMap.isEmpty() ? "Map đang rỗng" : "Map đang có dữ liệu");
        testMap.put(1, "A");
        testMap.put(2, "B");
        testMap.put(3, "C");
        testMap.put(4, "D");
        testMap.put(5, "E");

//        System.out.println(testMap);
//
//        testMap.put(6, "F");
//        System.out.println(testMap);
//
//
//        Set<Integer> keys = testMap.keySet();
//        for (Integer key : keys) {
//            System.out.println("Key: " + key + ": " + testMap.get(key));
//        }
    }
}