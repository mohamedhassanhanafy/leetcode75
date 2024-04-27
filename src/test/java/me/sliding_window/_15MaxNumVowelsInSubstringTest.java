package me.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _15MaxNumVowelsInSubstringTest {

    @Test
    void maxVowels() {
        //given
        String str = "abciiidef";
        int k = 3;
        //when
        _15MaxNumVowelsInSubstring underTest = new _15MaxNumVowelsInSubstring();
        double result = underTest.maxVowels(str, k);
        //then
        assertEquals(3, result);
    }

    @Test
    void maxVowels_caseAllVowels() {
        //given
        String str = "aeiou";
        int k = 2;
        //when
        _15MaxNumVowelsInSubstring underTest = new _15MaxNumVowelsInSubstring();
        double result = underTest.maxVowels(str, k);
        //then
        assertEquals(2, result);
    }

    @Test
    void maxVowels_caseNoVowels() {
        //given
        String str = "nmklqrtsd";
        int k = 2;
        //when
        _15MaxNumVowelsInSubstring underTest = new _15MaxNumVowelsInSubstring();
        double result = underTest.maxVowels(str, k);
        //then
        assertEquals(0, result);
    }
}