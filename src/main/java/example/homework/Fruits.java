package example.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("Апельсин");
        list.add("Киви");
        list.add("Яблоко");
        list.add("Банан");
        list.add("Ананас");
        list.add("Ананас");
        list.add("Яблоко");
        list.add("Банан");
        list.add("Арбуз");
        list.add("Дыня");
        list.add("Апельсин");

        HashSet<String> hashSet = new HashSet<>(list);

        System.out.println(list);
        System.out.println(hashSet);

        Map<String, Integer> hashMap = new HashMap<String, Integer>();

        for (int i = 0; i<list.size(); i++){
            String tempString = list.get(i);

            if (!hashMap.containsKey(tempString)) {
                hashMap.put(tempString, 1);
            }else {
                hashMap.put(tempString, hashMap.get(tempString) + 1);
            }
            }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ", Повторений = " + entry.getValue());
        }
    }
}
