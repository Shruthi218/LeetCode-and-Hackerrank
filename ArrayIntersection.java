import java.util.*;
public class ArrayIntersection{

     public void Intersection_Arrays(int nums1[],int nums2[]){
         Arrays.sort(nums1);
         Arrays.sort(nums2);
         
         ArrayList<Integer> l = new ArrayList<Integer>();
         
         int i=0;
         int j=0;
         
         
         while(i<nums1.length && j<nums2.length)
         {
             if(nums1[i] < nums2[j])
             {
                 i++;
             }
             
             else if(nums1[i] > nums2[j])
             {
                 j++;
             }
             
             else if(nums1[i]==nums2[j])
             {
                l.add(nums1[i]);
                 i++;
                 j++;
             }
         }
         
         System.out.println(l);
         
         
     }
     
     public static void main(String args[])
     {
         ArrayIntersection ar = new ArrayIntersection();
         
         int nums1[] = new int[] {1,3,3,9,8};
         int nums2[] = new int[] {8};
         ar.Intersection_Arrays(nums1,nums2);
         
         
     }
}
