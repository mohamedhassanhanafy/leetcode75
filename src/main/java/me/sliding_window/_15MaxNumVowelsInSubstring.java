package me.sliding_window;

public class _15MaxNumVowelsInSubstring {
    public int maxVowels(String s, int k) {

        char[] sChars = s.toCharArray();
        String vowels = "aeiou";
        //get max sum of initial k
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            if(vowels.indexOf(sChars[i]) > -1){
                maxSum++;
            }
        }

        int currentSum = maxSum;
        // check all sums of range by subtracting prev index and add new index
        for (int i = 1; i < sChars.length - k + 1 ; i++) {
            if(vowels.indexOf(sChars[i + k - 1]) > -1){
                currentSum++;
            }
            if(vowels.indexOf(sChars[i - 1]) > -1){
                currentSum--;
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return  maxSum;
    }
}
