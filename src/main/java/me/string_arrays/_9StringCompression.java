package me.string_arrays;

import java.util.Arrays;

public class _9StringCompression {
    
    public int compress(char[] chars) {
        if(chars.length <=1 ){
            return chars.length;
        }

        char currentChar;
        int numReptitve = 1;
        int charCompressedIndex =0;
        for (int i = 0; i < chars.length; i++) {
            currentChar = chars[i];
            chars[charCompressedIndex] = currentChar;

            while(i < chars.length-1 && currentChar == chars[i+1]){
                numReptitve ++;
                i++;
            }

            int numberOfDigits = insertNumbrAsDigits(chars, charCompressedIndex+1, numReptitve);
            charCompressedIndex += 1+numberOfDigits;


            numReptitve = 1;

        }
        return charCompressedIndex;
    }

    private int insertNumbrAsDigits(char[] chars, int index, int numReptitve){
        if (numReptitve == 0 || numReptitve == 1)
            return 0;

        String numStr = numReptitve +"";
        for (char c: numStr.toCharArray()){
            chars[index] = c;
            index++;
        }
        return  numStr.length();
    }
}
