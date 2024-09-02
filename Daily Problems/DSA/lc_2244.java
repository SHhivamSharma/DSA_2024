class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ;i < tasks.length ; i++){
            map.put( tasks[i] , map.getOrDefault(tasks[i],0)+1);
        }
        int round = 0 ;
        for(int val : map.values()){
            if(val == 1){
                return -1;
            }
            if(val%3 != 0){
                round+=(val/3) + 1;
            }else{
                round += val/3;
            }
        }
        return round;
    }
}