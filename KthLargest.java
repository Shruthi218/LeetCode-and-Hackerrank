/ * Done using Min-Heap */
    
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++) {
            pq.offer(nums[i]);
        }
        
        for(int j=k;j<nums.length;j++) {
            if(nums[j] > pq.peek()) {
                pq.poll();
                pq.offer(nums[j]);
            }
        }
        return pq.peek();
    }
}
