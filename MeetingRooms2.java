/* [[0, 30],[5, 10],[15, 20]] */

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length==0) return 0;
        // sort based on start time
        
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0])); 
        // pq min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(intervals[0][1]);
        System.out.println(pq);
        for (int i=1; i< intervals.length; i++) {
            if(intervals[i][0] >= pq.peek()) {
                pq.remove();
            }
            pq.add(intervals[i][1]);
        }
        return pq.size();
    }
    
}
