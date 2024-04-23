package me.string_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _8IncreasingTripletSubsequenceTest {

    @Test
    void increasingTriplet() {
        //given
        int[] num = {1,2,3,4};

        //when
        _8IncreasingTripletSubsequence underTest = new _8IncreasingTripletSubsequence();
        boolean result = underTest.increasingTriplet(num);
        //then
        assertEquals(true, result);
    }

    @Test
    void increasingTriplet_falseCondition() {
        //given
        int[] num = {5,4,3,2,1};

        //when
        _8IncreasingTripletSubsequence underTest = new _8IncreasingTripletSubsequence();
        boolean result = underTest.increasingTriplet(num);
        //then
        assertEquals(false, result);
    }

    @Test
    void increasingTriplet_notDirectSubsequent() {
        //given
        int[] num = {2,1,5,0,4,6};

        //when
        _8IncreasingTripletSubsequence underTest = new _8IncreasingTripletSubsequence();
        boolean result = underTest.increasingTriplet(num);
        //then
        assertEquals(true, result);
    }
}