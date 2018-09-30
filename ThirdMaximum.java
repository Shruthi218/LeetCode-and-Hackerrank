/*
array - > [1,3,10,4,2]
max1,max2 = 0;
a[0] > max1 --> max1 = a[0], max2 = 0
a[1] > max1 --> max2 = max1, max1 = a[1] (max1 =3, max2=1)
a[2] > max1 --> max2 = max1, max1 = a[2] (max1 = 10, max2 = 3)
a[3] is not greater than max1 but its greater than max2 ,
max2 = a[3], max1 will remain the same. (max1 = 10, max2 = 4)
*/





class Solution {
    public int thirdMax(int[] nums) {
       long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
         
         if(nums.length<3)  {
         int ans = Math.max(nums[0],nums[1]);
         return ans;
         }
         for(int i=0;i<nums.length;i++) {
             if(nums[i] > max1) {
                 max3 = max2;
                 max2 = max1;
                 max1 = nums[i];
             }
             else if(nums[i] > max2 && nums[i] < max1) {
                 max3 = max2;
                 max2 = nums[i];
             }
             else if(nums[i] > max3 && nums[i] < max2) {
                 max3 = nums[i];
                 
             }
         }
        if(Long.MIN_VALUE==max3 || max3==max2) 
         max3 = max1;
         
        Integer terrible = (int) (long) max3;
        return terrible;
        
    }
}
