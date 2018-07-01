class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int res[] = new int[m+n];
        int i=0,j=0,k=0;
        
        while(i<m && j<n) {
            
            if(nums1[i] < nums2[j]) {
                
                res[k] = nums1[i];
                i++;
                k++;
            }
            
            else if(nums1[i]==nums2[j]) {
                res[k] = nums1[i];
                i++;
                j++;
                k++;
            }
            
            else if(nums1[j] < nums2[i]) {
                j++;
                k++;
            }
        }
        
        for(int z=0;z<res.length;z++) {
            System.out.print(res[z]);
        }
    }
}
