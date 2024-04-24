package me.two_pointers;

import me.string_arrays._9StringCompression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _10IsSubsequenceTest {

    @Test
    void isSubsequence() {
        //given
        String s = "";
        String t = "";

        //when
        _10IsSubsequence underTest = new _10IsSubsequence();
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
        _10IsSubsequence underTest = new _10IsSubsequence();
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
        _10IsSubsequence underTest = new _10IsSubsequence();
        boolean result = underTest.isSubsequence(s, t);

        //then
        assertEquals(false, result);
    }
}