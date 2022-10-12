class Solution {
    public String decodeMessage(String s, String msg) {
        Map<Character, Character> map = new HashMap<>();
        int ch = 97;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') continue;
            if (!map.containsKey(c)) {
                map.put(c, (char)ch);
                ch++;
            }
        }

        String message = "";
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c == ' ') message += ' ';
            else {
                char cc = map.get(c);
                message += cc;
            }
        }
        return message;
    }
}
