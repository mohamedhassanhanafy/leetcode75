package me.string_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _6ReverseWordsStringTest {

    @Test
    void reverseWords() {
        //given
        String s = "the sky is blue";

        //when
        _6ReverseWordsString underTest = new _6ReverseWordsString();
        String result = underTest.reverseWords(s);
        //then
        assertEquals("blue is sky the", result);

    }

    @Test
    void reverseWords_case2() {
        //given
        String s = " hello world  ";

        //when
        _6ReverseWordsString underTest = new _6ReverseWordsString();
        String result = underTest.reverseWords(s);
        //then
        assertEquals("world hello", result);
    }

    @Test
    void reverseWords_case3() {
        //given
        String s = "a good   example";

        //when
        _6ReverseWordsString underTest = new _6ReverseWordsString();
        String result = underTest.reverseWords(s);
        //then
        assertEquals("example good a", result);
    }
}