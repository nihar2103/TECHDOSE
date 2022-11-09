class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        for (int val : map.keySet()) {
            q.offer(val);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = q.poll();
        }
        return ans;        
    }
}
