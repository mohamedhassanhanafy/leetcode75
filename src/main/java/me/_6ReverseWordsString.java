package me;

public class _6ReverseWordsString {

    public String reverseWords(String s) {

        s = s.replaceAll("\\s+"," ");
        String[] strArr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = strArr.length-1; i >=0 ; i--) {
            str.append(strArr[i] + " ");
        }

        return str.toString().trim();
    }
}
