// root(n)
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int y = 1 ;

        while(y <= x/y){
            y++;
        }
        return y-1;
    }
}


//log(root(n))
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int start = 0 ;
        int ans = 0 ;
        int end = Integer.MAX_VALUE;

        while( start <= end){
            int mid = start + (end - start)/2;

            if(mid <= x/mid){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans ;
    }
}

