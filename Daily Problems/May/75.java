// 75. Sort Colors

class Solution {
    public void swap(int[] nums , int i , int j){
        int tempo = nums[i];
        nums[i] = nums[j];
        nums[j] = tempo;
    }
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int start = 0  , end = nums.length - 1;
        int idx = 0 ; 
        while (idx <= end){
            if(nums[idx] == 0 ){
                swap(nums , start , idx );
                idx++;
                start++;
            }else if(nums[idx] == 2 ){
                swap(nums , end , idx );
                end--;
            }else{
                idx++;
            }
        }
    }
}