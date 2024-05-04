package me.stack;


import java.util.Iterator;
import java.util.LinkedList;

public class _24RemovingStarsFromString {
    public String removeStars(String s) {

        LinkedList<Character> strStack = new LinkedList<>();
        for (Character c : s.toCharArray()){
            if (c.equals('*') && !strStack.isEmpty() && !strStack.peek().equals('*')){
                strStack.pop();
            }else {
                strStack.push(c);
            }
        }
        StringBuilder str = new StringBuilder(strStack.size());
        Iterator<Character> iterator = strStack.descendingIterator();
        while (iterator.hasNext()){
            str.append(iterator.next());
        }
        return str.toString();
    }
}
