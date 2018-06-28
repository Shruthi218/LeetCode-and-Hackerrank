import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        HelloWorld hw = new HelloWorld();
        int nums[] = new int[] {0,1,0,3,12,0};
        hw.movezeroes(nums);
     }
     
     
     public void movezeroes(int nums[]) {
         
         List<Integer> al = new ArrayList<Integer>();
         for(int i=0;i<nums.length;i++) {
             
             if(nums[i]!=0) {
                 al.add(nums[i]);
             }
             else {
                 continue;
             }
             }
             for(int k=0;k<3;k++) {
                 al.add(0);
             }
             System.out.println(al);
         }
     }
