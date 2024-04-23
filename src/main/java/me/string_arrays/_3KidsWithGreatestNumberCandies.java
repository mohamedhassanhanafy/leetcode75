package me.string_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3KidsWithGreatestNumberCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // use simple for loop operation for getting max will improve performance as stream use comparator and boxing
        int maxCandies = Arrays.stream(candies).max().orElse(Integer.MAX_VALUE);
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            result.add(i, candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }
}
