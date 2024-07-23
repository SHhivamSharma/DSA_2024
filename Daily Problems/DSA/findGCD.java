class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length -1;
        int max = nums[n];
        int min = nums[0];
        int GCD = 1;
        for(int i = 1 ; i <= min ; i++){
            if(max % i == 0 && min % i == 0){
                GCD = i;
            }
        }
        return GCD;
    }
}