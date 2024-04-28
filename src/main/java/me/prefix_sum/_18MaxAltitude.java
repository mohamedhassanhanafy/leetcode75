package me.prefix_sum;

public class _18MaxAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // initial altitude
        int currentAltitude = 0;
        for (int i = 0; i <gain.length; i++) {
            currentAltitude += gain[i];
            if(currentAltitude > maxAltitude){
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
