class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0){
            return false ;
        }
        int temp = x;
        int rn = 0 ;
        while(temp > 0){
            rn = (rn *10) + (temp%10);
            temp/=10;
        }
        return x == rn;
    }
}