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
            Character currentElement = stack.pop();
            if(currentElement.equals('[')){
                // get number after [
                // should be extracted to another method
                String numberAfterBrackets = "";
                while (!stack.isEmpty()){
                    if("0123456789".contains(stack.peek().toString())){
                        numberAfterBrackets = stack.pop() + numberAfterBrackets;
                    }else {
                        break;
                    }
                }
                Integer numberOfRepeat = Integer.valueOf(numberAfterBrackets);


                // extract from closing stack all elements till closing ]
                StringBuilder repeatingStr = new StringBuilder();
                while (!closingBrackets.isEmpty()){
                    Character currentElementClosingStack = closingBrackets.pop();
                    if(currentElementClosingStack.equals(']')){
                        break;
                    }else {
                        repeatingStr.append(currentElementClosingStack);
                    }
                }

                StringBuilder fullRepeatedString = new StringBuilder();
                // create repeatinf String and push it again in closing Stack
                for (int i = 0; i < numberOfRepeat; i++) {
                    fullRepeatedString.append(repeatingStr);
                }
                for (int i = fullRepeatedString.length()-1 ; i > -1; i--) {
                    closingBrackets.push(fullRepeatedString.charAt(i));
                }


            }else {
                //
                closingBrackets.push(currentElement);
            }
        }
        while (!closingBrackets.isEmpty()){
            inputStr.append(closingBrackets.pop());
        }

        return inputStr.toString();
    }
}
