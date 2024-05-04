package me.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class _27RecentCalls {

    LinkedList<Integer> calls;
    public _27RecentCalls() {
        calls = new LinkedList<>();
    }

    public int ping(int t) {
        calls.add(t);

        int numPreviousCalls = 0;
        Iterator<Integer> iterator = calls.descendingIterator();
        int timeLimit = t - 3000;
        while (iterator.hasNext()){
            t = iterator.next();
            if(t >= timeLimit){
                numPreviousCalls++;
            }else{
                break;
            }
        }

        return numPreviousCalls;
    }
}
