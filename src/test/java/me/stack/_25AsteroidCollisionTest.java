package me.stack;

import me.sliding_window._16MaxConsecutiveOnesInBinary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _25AsteroidCollisionTest {

    @Test
    void asteroidCollision() {
        //given
        int[] nums = {-2,-2,1,-2};
        //when
        _25AsteroidCollision underTest = new _25AsteroidCollision();
        int[] result = underTest.asteroidCollision(nums);
        //then
        assertArrayEquals(new int[]{-2,-2,-2}, result);
    }
}