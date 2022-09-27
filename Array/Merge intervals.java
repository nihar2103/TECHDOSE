class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
			return intervals;
        }
        
        Arrays.sort(intervals, (m, n) -> (m[0] - n[0]));
        
        List<int[]> res = new ArrayList<>();
		for (int[] interval : intervals) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < interval[0]) {
                res.add(interval);
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], interval[1]);
            }
		}

		return res.toArray(new int[res.size()][]);
    }
}
