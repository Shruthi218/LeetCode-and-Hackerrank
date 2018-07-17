import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        int res[] = new int[] {0,1,0,3,12};
       movezeroes(res);
     }
     
     public static void movezeroes1(int nums[]) {
         
         List<Integer> al1 = new ArrayList<Integer>();
         List<Integer> al2 = new ArrayList<Integer>();
         for(int i=0;i<nums.length;i++) {
             if(nums[i]!=0) {
                 al1.add(nums[i]);
             }
             else if(nums[i]==0) {
                 al2.add(nums[i]);
             }
         }
         
         al1.addAll(al2);
         System.out.println(al1);
     }
}
