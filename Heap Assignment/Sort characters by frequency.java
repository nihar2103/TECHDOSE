class Solution {
public String frequencySort(String s) {
    TreeMap<Character,Integer> tm = new TreeMap<>();
    Queue<Character> heap = new PriorityQueue<>((x,y) -> (tm.get(y)-tm.get(x)));   
    String a = "";
	
    for(Character ch:s.toCharArray())
        tm.put(ch,tm.getOrDefault(ch,0)+1);
    for(Character ch:tm.keySet())
        heap.add(ch);
		
    while(heap.size()>0){
        Character chr = heap.poll();
        for(int i=0;i<tm.get(chr);i++)
            a += chr;
    }
    return a;
}
}
