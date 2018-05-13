class Solution {
    public int findPeakElement(int[] nums) {
        
        int start =0;
        int end = nums.length;
        
        
        
        while(start<end)
        {
            
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            
            
            else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1])
            {
                start = mid+1;
                
                
                
            }
            
            else
            {
                end = mid - 1;
            }
            
        }
        
    return 0;
        
    }
}
