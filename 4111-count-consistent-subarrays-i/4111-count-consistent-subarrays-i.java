class Solution {
    public int countConsistent(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int min_value=nums[i];
            int and_value=nums[i];
            for(int j=i;j<n;j++){
                and_value&=nums[j];
                min_value=Math.min(min_value,nums[j]);
                if(and_value==min_value) count++;
            }
        }
        return count;
    }
}