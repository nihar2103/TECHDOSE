class KthLargest {
    PriorityQueue<Integer> pq;
    int n;
    public KthLargest(int n, int[] nums) {
        this.n=n;
        pq=new PriorityQueue<>(n);
        
        for(int num:nums){
            pq.add(num);
            if(pq.size()>n) pq.remove();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>n){
            pq.remove();
        }
        return pq.peek();
    }
}
