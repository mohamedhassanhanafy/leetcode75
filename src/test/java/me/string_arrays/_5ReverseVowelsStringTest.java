package me.string_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _5ReverseVowelsStringTest {

    @Test
    void reverseVowels() {
        //given
        String s = "hello";

        //when
        _5ReverseVowelsString underTest = new _5ReverseVowelsString();
        String result = underTest.reverseVowels(s);
        //then
        assertEquals("holle", result);

    }

    @Test
    void reverseVowels_case2() {
        //given
        String s = "A man, a plan, a canal: Panama";

        //when
        _5ReverseVowelsString underTest = new _5ReverseVowelsString();
        String result = underTest.reverseVowels(s);
        //then
        assertEquals("a man, a plan, a canal: PanamA", result);

    }

    @Test
    void reverseVowels_caseOneCharVowel() {
        //given
        String s = "A";

        //when
        _5ReverseVowelsString underTest = new _5ReverseVowelsString();
        String result = underTest.reverseVowels(s);
        //then
        assertEquals("A", result);

    }

    @Test
    void reverseVowels_caseOneCharNotVowel() {
        //given
        String s = "B";

        //when
        _5ReverseVowelsString underTest = new _5ReverseVowelsString();
        String result = underTest.reverseVowels(s);
        //then
        assertEquals("B", result);

    }



    @Test
    void reverseVowels_caseRepeatedVowels() {
        //given
        String s = "AAAAAAAA";

        //when
        _5ReverseVowelsString underTest = new _5ReverseVowelsString();
        String result = underTest.reverseVowels(s);
        //then
        assertEquals("AAAAAAAA", result);

    }

}