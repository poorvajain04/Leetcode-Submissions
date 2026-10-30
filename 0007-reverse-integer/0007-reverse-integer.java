class Solution {
    public int reverse(int x) {
        int ans=0;
        while(x!=0){
            int r=x%10;
            if (ans > 214748364 || ans < -214748364) return 0;
            if (ans == 214748364 && r > 7) return 0;
            if (ans == -214748364 && r < -8) return 0;
            ans=(ans*10)+r;
            x/=10;
        }
        return ans;
        
    }
}