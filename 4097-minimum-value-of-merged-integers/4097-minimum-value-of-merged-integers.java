class Solution {
    public int minMergedInteger(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i += 2) {
            String s = "" + nums[i] + nums[i + 1];
            int num = Integer.parseInt(s);
            ans = Math.min(ans, num);
        }
        return ans;
    }
}