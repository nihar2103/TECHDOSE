class Solution {
    public int minimumRecolors(String blocks, int n) {
        int m = blocks.length(), minOps = Integer.MAX_VALUE, flips = 0, count = 0, i = 0;
        for(int j = 0; j < m; ++j) {
            if(blocks.charAt(j) == 'W') {
                flips++;
                count++;
            } else if(blocks.charAt(j) == 'B') {
                count++;
            }
            if(count == n) {
                minOps = Math.min(minOps, flips);
                if(blocks.charAt(i) == 'W') {
                    flips--;
                    count--;
                } else count--;
                i++;
            }
        }
        return minOps;
    }
}
