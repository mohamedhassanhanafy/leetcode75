package me;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _4CanPlaceFlowersTest {

    @Test
    void canPlaceFlowers() {
    }

    @Test
    void kidsWithCandies_case1() {
        //given
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        //when
        _4CanPlaceFlowers underTest = new _4CanPlaceFlowers();
        boolean result = underTest.canPlaceFlowers(flowerbed, n);
        //then
        assertEquals(true, result);
    }


    @Test
    void kidsWithCandies_noPlantsToseed() {
        //given
        int[] flowerbed = {1,0,1,0,1};
        int n = 0;

        //when
        _4CanPlaceFlowers underTest = new _4CanPlaceFlowers();
        boolean result = underTest.canPlaceFlowers(flowerbed, n);
        //then
        assertEquals(true, result);
    }

    @Test
    void kidsWithCandies_firstToBePlanted() {
        //given
        int[] flowerbed = {0,0,1,0,1};
        int n = 0;

        //when
        _4CanPlaceFlowers underTest = new _4CanPlaceFlowers();
        boolean result = underTest.canPlaceFlowers(flowerbed, n);
        //then
        assertEquals(true, result);
    }

    @Test
    void kidsWithCandies_lastToBePlanted() {
        //given
        int[] flowerbed = {1,0,1,0,0};
        int n = 0;

        //when
        _4CanPlaceFlowers underTest = new _4CanPlaceFlowers();
        boolean result = underTest.canPlaceFlowers(flowerbed, n);
        //then
        assertEquals(true, result);
    }

    @Test
    void kidsWithCandies_noToplants() {
        //given
        int[] flowerbed = {1,0,1,0,1};
        int n = 1;

        //when
        _4CanPlaceFlowers underTest = new _4CanPlaceFlowers();
        boolean result = underTest.canPlaceFlowers(flowerbed, n);
        //then
        assertEquals(false, result);
    }
}


