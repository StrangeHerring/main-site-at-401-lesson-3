package example.homework;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(123456, "Иванов");
        hashMap.put(234567, "Петров");
        hashMap.put(345678, "Сидоров");
        hashMap.put(456789, "Кузнецов");
        hashMap.put(567890, "Иванов");
        hashMap.put(678901, "Петров");

        System.out.println(getKeysByValue(hashMap, "Иванов"));
    }
    public static <Integer, String> Set<Integer> getKeysByValue(Map<Integer, String> map, String value) {
        Set<Integer> keys = new HashSet<Integer>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
