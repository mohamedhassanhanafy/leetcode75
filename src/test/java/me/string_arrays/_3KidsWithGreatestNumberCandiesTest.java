package me.string_arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _3KidsWithGreatestNumberCandiesTest {

    @Test
    void kidsWithCandies_case1() {
        //given
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        //when
        _3KidsWithGreatestNumberCandies underTest = new _3KidsWithGreatestNumberCandies();
        List<Boolean> result = underTest.kidsWithCandies(candies, extraCandies);
        //then
        Boolean[] expected = {true,true,true,false,true};
        assertEquals(Arrays.asList(expected), result);
    }

    @Test
    void kidsWithCandies_case2() {
        //given
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        //when
        _3KidsWithGreatestNumberCandies underTest = new _3KidsWithGreatestNumberCandies();
        List<Boolean> result = underTest.kidsWithCandies(candies, extraCandies);
        //then
        Boolean[] expected = {true,false,false,false,false};
        assertEquals(Arrays.asList(expected), result);
    }

    @Test
    void kidsWithCandies_case3() {
        //given
        int[] candies = {12,1,12};
        int extraCandies = 10;

        //when
        _3KidsWithGreatestNumberCandies underTest = new _3KidsWithGreatestNumberCandies();
        List<Boolean> result = underTest.kidsWithCandies(candies, extraCandies);
        //then
        Boolean[] expected = {true,false,true};
        assertEquals(Arrays.asList(expected), result);
    }
}