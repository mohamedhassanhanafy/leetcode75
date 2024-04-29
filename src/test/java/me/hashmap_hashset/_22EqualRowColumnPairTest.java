package me.hashmap_hashset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _22EqualRowColumnPairTest {

    @Test
    void equalPairs() {
        //given
        int[][] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};

        //when
        _22EqualRowColumnPair underTest = new _22EqualRowColumnPair();
        int result = underTest.equalPairs(grid);

        //then
        assertEquals(3, result);
    }
}