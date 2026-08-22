class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int prod=1;
        while(temp>0){
            int a=temp%10;
            sum+=a;
            prod*=a;
            temp/=10;
        }
        int total=sum+prod;
        return (n%total==0)?true:false;
    }
}