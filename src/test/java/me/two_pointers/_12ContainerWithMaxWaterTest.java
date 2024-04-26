package me.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _12ContainerWithMaxWaterTest {

    @Test
    void maxArea_case1() {
        //given
        int[] heights = {1,8,6,2,5,4,8,3,7};
        //when
        _12ContainerWithMaxWater underTest = new _12ContainerWithMaxWater();
        int result = underTest.maxArea(heights);
        //then
        assertEquals(49, result);
    }

    @Test
    void maxArea_case2() {
        //given
        int[] heights = {1,1};
        //when
        _12ContainerWithMaxWater underTest = new _12ContainerWithMaxWater();
        int result = underTest.maxArea(heights);
        //then
        assertEquals(1, result);
    }
}