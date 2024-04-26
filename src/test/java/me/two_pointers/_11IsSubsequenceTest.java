package me.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _11IsSubsequenceTest {

    @Test
    void isSubsequence() {
        //given
        String s = "";
        String t = "";

        //when
        _11IsSubsequence underTest = new _11IsSubsequence();
        boolean result = underTest.isSubsequence(s, t);

        //then
        assertEquals(true, result);
    }

    @Test
    void isSubsequence_simpleTrue() {
        //given
        String s = "abc";
        String t = "ahbgdc";

        //when
        _11IsSubsequence underTest = new _11IsSubsequence();
        boolean result = underTest.isSubsequence(s, t);

        //then
        assertEquals(true, result);
    }

    @Test
    void isSubsequence_simpleFalse() {
        //given
        String s = "axc";
        String t = "ahbgdc";

        //when
        _11IsSubsequence underTest = new _11IsSubsequence();
        boolean result = underTest.isSubsequence(s, t);

        //then
        assertEquals(false, result);
    }
}