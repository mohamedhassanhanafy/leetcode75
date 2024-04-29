package me.hashmap_hashset;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _21UniqueNumberOfOccurenceTest {

    @Test
    void uniqueOccurrences() {
        //given
        int[] nums1 = {1,2,2,1,1,3};

        //when
        _21UniqueNumberOfOccurence underTest = new _21UniqueNumberOfOccurence();
        boolean result = underTest.uniqueOccurrences(nums1);

        //then
        assertTrue(result);
    }
}