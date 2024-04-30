package me.hashmap_hashset;

import java.util.*;
import java.util.stream.Collectors;

public class _22EqualRowColumnPair {
    public int equalPairs(int[][] grid) {

        // key could be too List.toString()
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < grid.length ; i++) {
            List<Integer> row = new ArrayList<>(grid.length);
            for (int j = 0; j < grid.length; j++) {
                row.add(grid[i][j]);
            }
            if (map.containsKey(row)){
                map.put(row, map.get(row)+1);
            }else {
                map.put(row, 1);
            }
        }

        int numOfPairs = 0;
        for (int i = 0; i < grid.length; i++) { // i is column
            List<Integer> column = new ArrayList<>(grid.length);
            for (int j = 0; j < grid.length; j++) { // k is row
                column.add(grid[j][i]);
            }
            if(map.containsKey(column)){
                numOfPairs += map.get(column);
            }

        }
        return numOfPairs;
    }
}
