class Solution {
    public int countDominantElements(int[] nums) {
        int rslt = 0;
        if (nums.length == 1) return 1;
        for(int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] >= nums[1])
                    rslt++;
            } else if (i == nums.length - 1) {
                if (nums[i] >= nums[nums.length - 2])
                    rslt++;
            } else {
                if (nums[i] >= ((double) (nums[i - 1] + nums[i + 1]))/2)
                    rslt++;
            }
        }
        return rslt;
    }
}