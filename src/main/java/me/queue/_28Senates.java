package me.queue;

import java.util.LinkedList;

public class _28Senates {
    public String predictPartyVictory(String senate) {
        LinkedList<Integer> qr=new LinkedList<>();
        LinkedList<Integer> qd=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') qr.add(i);
            else qd.add(i);
        }

        while(!qr.isEmpty() && !qd.isEmpty()){
            int a=qr.poll();
            int b=qd.poll();
            if(a<b) qr.add(a+n);
            else qd.add(b+n);
        }
        if(qr.size()>qd.size()) return "Radiant";
        else return "Dire";
    }

}
