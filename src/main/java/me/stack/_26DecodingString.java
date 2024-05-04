package me.stack;

import java.util.LinkedList;
import java.util.Stack;

public class _26DecodingString {

    // 3[a]2[bc]
    // 3[a2[c]]
    //2[abc]3[cd]ef
    public String decodeString(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder inputStr = new StringBuilder();
        LinkedList<Character> closingBrackets = new LinkedList<>();
        while (!stack.isEmpty()){
            StringBuilder tempStr = new StringBuilder();
            char currentChar = stack.pop();
            if (currentChar == ']'){
                closingBrackets.push(currentChar);
            }else if (currentChar == '['){
                int numberOfRepeat = stack.pop();
            }else { // str
                if(closingBrackets.isEmpty()){
                    inputStr.append(tempStr);
                }else {
                    
                }
            }


        }
        return "";
    }
}
