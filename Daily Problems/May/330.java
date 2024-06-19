//330. Patching Array
class Solution {
    public int minPatches(int[] nums, int n) {
        long SumFormed = 0;
        long ExpectedSum = 0;
        int minPatches = 0;
        
        int i = 0 ;
        int m = nums.length;
        while(SumFormed < n){
            if(SumFormed >= ExpectedSum ){
                // ExpectedSum++; // if we have current then check for next value
                ExpectedSum = SumFormed + 1; 
                // When we know that we can genragte the sum till              
                // SumFormed no need to ++  ExpectedSum just check for SumFormed + 1
            }else{
                if( i < m && ExpectedSum >= nums[i] ){
                    SumFormed+= nums[i];
                    i++;
                }else{
                    // added expected sum ito out array 
                    minPatches++;
                    SumFormed+=ExpectedSum;
                }
            }
        }
        return minPatches;

        // long miss = 1;
        // int result = 0;
        // int i = 0;

        // while (miss <= n) {
        //     if (i < nums.length && nums[i] <= miss) {
        //         miss += nums[i];
        //         i++;
        //     } else {
        //         miss += miss;
        //         result++;
        //     }
        // }

        // return result;
    }
}