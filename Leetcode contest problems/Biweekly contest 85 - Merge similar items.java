class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] valueWeight = new int[1001];
        addValueWeight(valueWeight, items1);
        addValueWeight(valueWeight, items2);
        for (int i = 0; i < valueWeight.length; i++) {
            if (valueWeight[i] > 0) {
                ans.add(List.of(i, valueWeight[i]));
            }
        }
        return ans;
    }
    private void addValueWeight(int[] valueWeight, int[][] items) {
        for(int[] item : items) {
            valueWeight[item[0]] += item[1];
        }
    }
}
