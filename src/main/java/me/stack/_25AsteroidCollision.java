package me.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class _25AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {


        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i <asteroids.length; i++) {
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
                continue;
            }// no zero so minus
            // case of minus i.e opposite direction
            if(stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroids[i]);
                continue;
            }

            // here collision will happen so go through all element till destroy all or grt destroyed
            while (!stack.isEmpty()){
                Integer top = stack.peek();
                if(top < 0){ // following top
                    stack.push(asteroids[i]);
                    break;
                }

                if(top > Math.abs(asteroids[i])){
                    break;
                }else if (top == Math.abs(asteroids[i])){
                    stack.pop();
                    break;
                }else {
                    stack.pop();
                    if (stack.isEmpty()){ // edge case in case removing last element of stack
                        stack.push(asteroids[i]);
                        break;
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        Iterator<Integer> iterator = stack.descendingIterator();
        for (int i = 0; i <stack.size(); i++) {
            result[i] = iterator.next();
        }
        return result;
    }
}
