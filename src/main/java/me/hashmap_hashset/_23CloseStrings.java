package me.hashmap_hashset;

import java.util.*;

public class _23CloseStrings {
    public boolean closeStrings(String word1, String word2) {

        // from hints
        // Operation 1 allows you to freely reorder the string.
        // Operation 2 allows you to freely reassign the letters' frequencies.
        // so we can get the number of occurence of charchters and we need to make sure that
        // 1- number of occurence from str1 & str2 are equal (without order)
        // 2- also number of entries are equal
        // 3- keys should also be equal
        Map<Character, Integer> str1 = new TreeMap<>();
        for (Character c : word1.toCharArray()){
            if(str1.containsKey(c)){
                str1.put(c, str1.get(c)+ 1);
            }else {
                str1.put(c, 1);
            }
        }

        HashMap<Character, Integer> str2 = new HashMap<>();
        for (Character c : word2.toCharArray()){
            if(str2.containsKey(c)){
                str2.put(c, str2.get(c)+ 1);
            }else {
                str2.put(c, 1);
            }
        }

        boolean hasSameNumberOfEntries = str1.size() == str2.size();
        List<Integer> values1 = new ArrayList<>(str1.values());
        List<Integer> values2 = new ArrayList<>(str2.values());
        Collections.sort(values1);
        Collections.sort(values2);
        Collections.sort(values1);
        Collections.sort(values2);
        return hasSameNumberOfEntries && values1.equals(values2) && str1.keySet().equals(str2.keySet());

    }
}
