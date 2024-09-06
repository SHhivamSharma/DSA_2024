class Solution {
    long ans = 0;
    long sumOfSeries(long n) {
        return getAns( n);
    }
    
    long getAns(long num){
        if(num <= 0){
            return ans;
        }
        
        ans+=(num*num*num);
        getAns( num-1);
        
        return ans;
    }
}