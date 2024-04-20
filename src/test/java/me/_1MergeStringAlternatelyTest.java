package me;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1MergeStringAlternatelyTest {

    @Test
    void mergeAlternately_SimpleSameLemgth() {
        //given
        String word1 = "abc";
        String word2 = "pqr";

        //when
        _1MergeStringAlternately underTest = new _1MergeStringAlternately();
        String result = underTest.mergeAlternately(word1, word2);
        //then
        assertEquals("apbqcr", result);
    }


    @Test
    void mergeAlternately_word1LengthGreaterThanWord2() {
        //given
        String word1 = "abcde";
        String word2 = "pqr";

        //when
        _1MergeStringAlternately underTest = new _1MergeStringAlternately();
        String result = underTest.mergeAlternately(word1, word2);
        //then
        assertEquals("apbqcrde", result);
    }

    @Test
    void mergeAlternately_word1LengthLessThanWord2() {
        //given
        String word1 = "abc";
        String word2 = "pqrxy";

        //when
        _1MergeStringAlternately underTest = new _1MergeStringAlternately();
        String result = underTest.mergeAlternately(word1, word2);
        //then
        assertEquals("apbqcrxy", result);
    }
}