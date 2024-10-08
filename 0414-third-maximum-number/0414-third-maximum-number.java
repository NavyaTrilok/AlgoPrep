class Solution {
    public int thirdMax(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums){
            if(!set.contains(i)){
                pq.add(i);
                set.add(i);
                
                if(pq.size() > 3){
                   set.remove(pq.poll());
                }
            }
        }
        
        if(pq.size()<3){
            if(pq.size()>1){
                pq.poll();
            }
        }
        
        return pq.peek();
        
    }
}