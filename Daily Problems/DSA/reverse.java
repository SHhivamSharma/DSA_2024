class Solution {
    public int reverse(int x) {
        int ans  = 0;
        int mul = x > 0 ? 1 : -1;
        x = Math.abs(x);
        while (x > 0){
            int num = x%10;
            if( ans > (Integer.MAX_VALUE - num)/10 ){
                return 0;
            }
            ans = ( ans * 10) + num;
            x = x/10;
        }
        return ans*mul;
    }
}