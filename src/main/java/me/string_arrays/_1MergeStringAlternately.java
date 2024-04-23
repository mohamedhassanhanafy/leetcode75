package me.string_arrays;

public class _1MergeStringAlternately {


        public String mergeAlternately(String word1, String word2) {
            int minLength = Math.min(word1.length(), word2.length());
            StringBuilder result = new StringBuilder();
            for (int i=0; i< minLength; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            if (word1.length() > minLength){
                result.append(word1.substring(minLength));
            }
            if (word2.length() > minLength){
                result.append(word2.substring(minLength));
            }

            return result.toString();
        }
}
