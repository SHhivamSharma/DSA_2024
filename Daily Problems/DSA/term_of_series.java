class Solution {
    static int findNthTerm(int N) {
        // code here
        int ans = 0 ;
        
        ans = N + (((N)*(N-1)))/2;
        return ans ;
        
    }
};