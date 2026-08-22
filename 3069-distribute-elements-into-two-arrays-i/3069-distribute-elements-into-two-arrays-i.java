class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer>num1=new ArrayList<>();
        List<Integer>num2=new ArrayList<>();
        num1.add(nums[0]);
        num2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int len1=num1.size();
            int len2=num2.size();
            if(num1.get(len1-1)>num2.get(len2-1)) num1.add(nums[i]);
            else num2.add(nums[i]);
        }
        int[] res=new int[nums.length];
        int m=num1.size();
        for(int i=0;i<m;i++){
            res[i]=num1.get(i);
        }
        int n=num2.size();
        for(int i=0;i<n;i++){
            res[i+m]=num2.get(i);
        }
    return res;
    }
}