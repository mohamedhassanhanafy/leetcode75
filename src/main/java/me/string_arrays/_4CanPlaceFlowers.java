package me.string_arrays;

public class _4CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        //check if n = 0
        if(n == 0){
            return true;
        }

        //check case 1 element
        if(flowerbed.length == 1){
            return flowerbed[0] == 0;
        }

        int remeaningFlowers = n;
        // check all cases
        for (int i = 0; i < flowerbed.length; i++) {

            if(flowerbed[i] == 1){
                i++;// leap 2 steps
                continue;
            }

            boolean prevElementCondition = i == 0 || flowerbed[i - 1] == 0;
            boolean nextElementCondition = i == flowerbed.length-1 || flowerbed[i + 1] == 0;
            if(prevElementCondition && flowerbed[i] == 0 && nextElementCondition){
                remeaningFlowers--;
                flowerbed[i] = 1;
                if(remeaningFlowers == 0){
                    return true;
                }
            }

        }
        return false;
    }
}
