//Time Limit Exceeded Soluyion 
//523. Continuous Subarray Sum
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        for(int i = 0 ; i < len  ; i++){
            boolean flag = false;
            int sumSf = 0;

            for(int j = i ; j < len ; j++){
                sumSf += nums[j];
                if(flag){
                    if(sumSf % k == 0){
                        return true;
                    }
                }
                flag = true;
            }
        }
        return false ;
    }
}


