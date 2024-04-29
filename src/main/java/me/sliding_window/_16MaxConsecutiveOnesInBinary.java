package me.sliding_window;

public class _16MaxConsecutiveOnesInBinary {
    public int longestOnes(int[] nums, int k) {

        int rIndex = 0;
        int lIndex = 0;
        int result = 0;

        while (rIndex < nums.length){
            if(nums[rIndex] == 0){// expand the window till it reach its max
                k--;
            }
            // here will start to make left side move to last zero |
            // BTW k<0 could be replaced to k == -1 (as right edge can only lead by k and on same loop we increment left)
            while (k < 0){
                // in case of 1, left sliding edge will keep moving
                // in case of 0, we will increment k to make it to move with i movement
                if (nums[lIndex] == 0){
                    k++;
                }
                lIndex++;//
            }
            result = Math.max(result, rIndex - lIndex + 1);
            rIndex++;
        }

        return  result;
    }
}
