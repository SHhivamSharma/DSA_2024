// 1051. Height Checker

class Solution {
    public int heightChecker(int[] heights) {
        int len  = heights.length;
        int[] expected = new int[len];
        for(int j = 0  ;  j < len ; j++){
            expected[j] = heights[j];
        }
        int ans = 0;
        Arrays.sort(expected);
        for(int i = 0 ; i < len ; i++){
            if( heights[i] != expected[i]){
                ans = ans +1;
            }
        }
        return ans;
    }
}



class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                count++;
            }
        }
        return count;
    }
}
