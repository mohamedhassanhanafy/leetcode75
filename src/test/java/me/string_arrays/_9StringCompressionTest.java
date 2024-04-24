package me.string_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _9StringCompressionTest {

    @Test
    void compress() {
        //given
        char[] chars = {'a','a','b','b','c','c','c'};

        //when
        _9StringCompression underTest = new _9StringCompression();
        int result = underTest.compress(chars);

        //then
        assertArrayEquals(new char[]{'a','2','b','2','c','3', 'c'}, chars);
        assertEquals(6, result);
    }


    @Test
    void compress_differentumbers() {
        //given
        char[] chars = {'a','b','c'};

        //when
        _9StringCompression underTest = new _9StringCompression();
        int result = underTest.compress(chars);

        //then
        assertArrayEquals(new char[]{'a','b','c'}, chars);
        assertEquals(3, result);
    }

    @Test
    void compress_longSequence() {
        //given
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b'};

        //when
        _9StringCompression underTest = new _9StringCompression();
        int result = underTest.compress(chars);

        //then
        assertArrayEquals(new char[]{'a','b','1','1','b','b','b','b','b','b','b','b'}, chars);
        assertEquals(4, result);
    }
}