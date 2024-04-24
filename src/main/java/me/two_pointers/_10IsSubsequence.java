package me.two_pointers;

public class _10IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length())
            return false;

        if (s.isEmpty())
            return true;

        char[] sArr = s.toCharArray();
        int sCoveredIndices = 0;
        for (char tChar : t.toCharArray()) {
            if (tChar == sArr[sCoveredIndices]) {
                sCoveredIndices++;
            }
            if (sCoveredIndices >= sArr.length) {
                return true;
            }
        }
        return false;
    }
}
