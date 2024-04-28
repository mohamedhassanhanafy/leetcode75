package me.prefix_sum;

import me.sliding_window._14MaxAvgSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _18MaxAltitudeTest {

    @Test
    void largestAltitude_Case1() {

        //given
        int[] gain = {-5,1,5,0,-7};
        //when
        _18MaxAltitude underTest = new _18MaxAltitude();
        double result = underTest.largestAltitude(gain);
        //then
        assertEquals(1, result);
    }

    @Test
    void largestAltitude_Case2() {

        //given
        int[] gain = {-4,-3,-2,-1,4,3,2};
        //when
        _18MaxAltitude underTest = new _18MaxAltitude();
        double result = underTest.largestAltitude(gain);
        //then
        assertEquals(0, result);
    }

    @Test
    void largestAltitude_allMinus() {

        //given
        int[] gain = {-4,-3,-2,-1};
        //when
        _18MaxAltitude underTest = new _18MaxAltitude();
        double result = underTest.largestAltitude(gain);
        //then
        assertEquals(0, result);
    }
}