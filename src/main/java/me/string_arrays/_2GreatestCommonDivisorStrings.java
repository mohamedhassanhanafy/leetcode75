package me.string_arrays;

public class _2GreatestCommonDivisorStrings {

    public String gcdOfStrings(String str1, String str2) {

        String minString = str1.length() >= str2.length() ? str2 : str1;

        String greatestCommon = "";
        for(int i= minString.length(); i >= 1; i--){
            String toBeGreatestCommon = minString.substring(0, i);
            // check reminder is zero for result of split of str1 & str2 i.e this is common between both of them
            int splitLengthStr1 = str1.split(toBeGreatestCommon, -1).length-1;
            int splitLengthStr2 = str2.split(toBeGreatestCommon, -1).length-1;
            if(splitLengthStr1 == 0 || splitLengthStr2 == 0)
                continue;

            if(str1.length() == toBeGreatestCommon.length() * splitLengthStr1 &&
                    str2.length() == toBeGreatestCommon.length() * splitLengthStr2  ){
                greatestCommon = toBeGreatestCommon;
                break;
            }
        }

        return greatestCommon;
    }
}
