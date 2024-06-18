//826. Most Profit Assigning Work

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int res = 0, j = 0, best = 0;
        List<Pair<Integer, Integer>> temp = new ArrayList<>();
        
        for (int i = 0; i < worker.length; ++i) {
            temp.add(new Pair<>(difficulty[i], profit[i]));
        }
        
        temp.sort((a, b) -> a.getKey() - b.getKey());
        Arrays.sort(worker);
        
        for (int work : worker) {
            while (j < temp.size() && work >= temp.get(j).getKey()) {
                best = Math.max(best, temp.get(j++).getValue());
            }
            
            res += best;
        }
        
        return res;
    }
}