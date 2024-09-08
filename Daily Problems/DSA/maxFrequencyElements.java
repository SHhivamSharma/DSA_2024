class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer ,Integer > map = new HashMap<>();
        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i], 0)+1 );
        }

        int maxFreq = 0 ; 
        int ans = 0 ;

        for(int val : map.keySet()){
            int freq = map.get(val);
            if(freq == maxFreq ){
                ans = ans+ freq;

            }else if( freq > maxFreq){
                 ans = freq;
                 maxFreq = freq;
            }
        }

        return ans;

    }
}