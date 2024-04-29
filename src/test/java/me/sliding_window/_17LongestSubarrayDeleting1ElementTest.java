package me.sliding_window;

import me.prefix_sum._18MaxAltitude;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _17LongestSubarrayDeleting1ElementTest {

    @Test
    void longestSubarray() {
        //given
        int[] gain = {1,1,0,1};
        //when
        _17LongestSubarrayDeleting1Element underTest = new _17LongestSubarrayDeleting1Element();
        int result = underTest.longestSubarray(gain);
        //then
        assertEquals(3, result);
    }

    @Test
    void longestSubarray_case2() {
        //given
        int[] gain = {0,1,1,1,0,1,1,0,1};
        //when
        _17LongestSubarrayDeleting1Element underTest = new _17LongestSubarrayDeleting1Element();
        int result = underTest.longestSubarray(gain);
        //then
        assertEquals(5, result);
    }
}