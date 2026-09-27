class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long ssum=0;
        long tsum=0;
        for(int s:source){
            ssum+=s;
        }
        for(int t:target){
            tsum+=t;
        }
        return ssum==tsum;
    }
}