package me.hashmap_hashset;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class _21UniqueNumberOfOccurence {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            Integer currentInt = arr[i];
            if (map.containsKey(currentInt)){
                map.put(currentInt, map.get(currentInt)+1);
            }else {
                map.put(currentInt, 1);
            }
        }
        return map.keySet().size() ==  new HashSet<>(map.values()).size();
    }
}
