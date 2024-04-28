package me.prefix_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _19PivotIndexTest {

    @Test
    void pivotIndex() {
        //given
        int[] gain = {1,7,3,6,5,6};
        //when
        _19PivotIndex underTest = new _19PivotIndex();
        int result = underTest.pivotIndex(gain);
        //then
        assertEquals(3, result);
    }
}