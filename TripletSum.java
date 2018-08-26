import java.util.*;
public class TripletSum {
    
    public static void main(String args[]) {
        TripletSum hw = new TripletSum();
        int b[] = new int[]{-2,-2,4,1,15};
        boolean ans = three_sum(b,0);
        System.out.println(ans);
    }
    
    public static boolean three_sum(int nums[],int sum) {
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right) {
                if(nums[i] + nums[left] + nums[right] ==sum) {
                    return true;
                }
                else if(nums[i]+nums[left]+nums[right]<sum) {
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right] > sum) {
                    right--;
                }
            }
            
        }
        return false;
    }
}
        
