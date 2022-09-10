import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] num) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int a:num){
            int b=result.size();
            for(int i=0;i<b;i++){
                ArrayList<Integer> r=new ArrayList(result.get(i));
                r.add(a);
                result.add(r);
            }
        }
        return res;
    }
}
