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


// Correct Solution
class Solution {

    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0,-1);//If we get the Sum i first index itselsf
        int sum =0;
        for(int i = 0 ; i<nums.length ; i++){
            sum+=nums[i];
            int mod = sum%k;
            if(map.containsKey(mod)){
                int idx = map.get(mod);
                if(i - idx >= 2){
                    return true;
                }
            }else{
                map.put(mod , i);
            }
        }
        return false;
    }

}

