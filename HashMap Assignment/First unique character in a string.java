class Solution {
		public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z';i++) {
            int index = s.indexOf (i);
            if (index != -1 && index == s.lastIndexOf (i))
                ans = Math.min (ans,index);
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
