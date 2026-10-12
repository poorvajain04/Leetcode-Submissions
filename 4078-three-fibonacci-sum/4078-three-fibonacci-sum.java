class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=1;
        while(c<n){
            if(a+b+c==n){
                return true;
            }
            a=b;
            b=c;
            c=a+b;
        }
        return a+b+c==n;
    }
}