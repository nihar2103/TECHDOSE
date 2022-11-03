class Solution {
   public String frequencySort(String s) {
        int[] count = new int[128];
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> count[b] - count[a]);  
        for (int i = 0; i < 128; i++) {
            if (count[i] != 0) {
                pq.add((char) i);    
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for (int i = 0; i < count[ch]; i++) {
                sb.append(ch);   
            }
        }
        return sb.toString();
    }
}
