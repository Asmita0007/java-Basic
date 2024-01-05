import java.util.HashMap;
import java.util.Map;

public class KeyValueHashMap {
    public static void main(String[] args) {
        
        Map<String, Integer> keyValueMap = new HashMap<>();

       
        keyValueMap.put("one", 1);
        keyValueMap.put("two", 3);
        keyValueMap.put("three", 5);

        
        keyValueMap.put("two", 2);

        
        int twoValue = keyValueMap.get("two");
        System.out.println("Value for key 'two' is " + twoValue);

        
        for (Map.Entry<String, Integer> entry : keyValueMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
