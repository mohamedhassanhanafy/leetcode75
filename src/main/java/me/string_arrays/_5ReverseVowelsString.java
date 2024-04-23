package me.string_arrays;

public class _5ReverseVowelsString {

    public String reverseVowels(String s) {

        int leftIndex = 0;
        int rightIndex = s.length()-1;
        String vowels = "aeiouAEIOU"; // I used first List<Character> and contains which adds of cpu time use index better
        char[] s_arr = s.toCharArray();

        boolean isLeftCharVowel = false, isRightCharVowel = false;
        while (leftIndex < rightIndex){

            //swap condition
            if(isLeftCharVowel && isRightCharVowel){
                char temp = s_arr[leftIndex];
                s_arr[leftIndex] = s_arr[rightIndex];
                s_arr[rightIndex] = temp;
                leftIndex ++;
                rightIndex--;
                isLeftCharVowel = false;
                isRightCharVowel = false;
            }

            if (vowels.indexOf(s_arr[leftIndex]) > -1){
                isLeftCharVowel = true;
            } else{
                leftIndex++;
            }

            if (vowels.indexOf(s_arr[rightIndex]) > -1){
                isRightCharVowel = true;
            }else {
                rightIndex --;
            }


        }
        return new String(s_arr);
    }

}
