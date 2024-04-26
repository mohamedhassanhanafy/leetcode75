package me.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _10MoveZerosTest {

    @Test
    void moveZeroes_case1() {

        //given
        int[] nums = {0,1,0,3,12};
        //when
        _10MoveZeros underTest = new _10MoveZeros();
        underTest.moveZeroes(nums);
        //then
        assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
}