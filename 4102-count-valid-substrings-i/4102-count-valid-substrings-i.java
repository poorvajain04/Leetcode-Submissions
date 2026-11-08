class Solution{  
    public long countValidSubstrings(String s) {
        long res = 0;
        for (int i = 0, j = 0; j < s.length(); ++j) {
            if (j >= 2 && s.charAt(j - 2) == 'a'
                && s.charAt(j - 1) == 'b' && s.charAt(j) == 'c')
                i = j - 1;
            res += j - i + 1;
        }
        return res;
    }
}