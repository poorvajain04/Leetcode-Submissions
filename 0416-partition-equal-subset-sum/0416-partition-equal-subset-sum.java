class Solution {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        for(int x:nums){
            total+=x;
        }
        if(total%2!=0) return false;
        boolean[] dp = new boolean[(total/2) + 1];
        dp[0] = true;
        for (int x : nums) {
            for (int j = (total/2); j >= x; j--) {
                dp[j] = dp[j] || dp[j - x];
            }
        }
        return dp[total/2];
    }
}