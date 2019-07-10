class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if(len <= 1 || intervals==null) return intervals;
        
        // sort based on start times
        
        Arrays.sort(intervals,new Comparator<int[]>() {
            
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        int num = 0;
        for(int i=1; i < len ; i++) {
            if(intervals[i][0] <= intervals[num][1]) {
                if(intervals[i][1] >= intervals[num][1]) {
                    intervals[num][1] = intervals[i][1];
                }
            }
                else {
                    num++;
                    intervals[num] = intervals[i];
                    // this is similar to remove duplicates in sorted array
                }
            }
        
        return Arrays.copyOfRange(intervals,0,num+1);
    }
}
