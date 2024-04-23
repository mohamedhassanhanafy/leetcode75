package me.string_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _2GreatestCommonDivisorStringsTest {

    @Test
    void gcdOfStrings_1() {

        //given
        String word1 = "ABCABC";
        String word2 = "ABC";

        //when
        _2GreatestCommonDivisorStrings underTest = new _2GreatestCommonDivisorStrings();
        String result = underTest.gcdOfStrings(word1, word2);
        //then
        assertEquals("ABC", result);
    }


    @Test
    void gcdOfStrings_2() {

        //given
        String word1 = "ABABAB";
        String word2 = "AB";

        //when
        _2GreatestCommonDivisorStrings underTest = new _2GreatestCommonDivisorStrings();
        String result = underTest.gcdOfStrings(word1, word2);
        //then
        assertEquals("AB", result);
    }

    @Test
    void gcdOfStrings_3() {

        //given
        String word1 = "ABABABAB";
        String word2 = "ABAB";

        //when
        _2GreatestCommonDivisorStrings underTest = new _2GreatestCommonDivisorStrings();
        String result = underTest.gcdOfStrings(word1, word2);
        //then
        assertEquals("ABAB", result);
    }

    @Test
    void gcdOfStrings_4() {

        //given
        String word1 = "LEET";
        String word2 = "CODE";

        //when
        _2GreatestCommonDivisorStrings underTest = new _2GreatestCommonDivisorStrings();
        String result = underTest.gcdOfStrings(word1, word2);
        //then
        assertEquals("", result);
    }
}