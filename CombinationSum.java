import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int b[] = new int[] {2,4,3,5,7,8,9};
        two_sum(b,7);
     }
     
     public static void two_sum(int a[],int target) {
         HashSet<Integer> set = new HashSet<Integer>();
         for(int i=0;i<a.length;i++) {
             if(!set.contains(a[i])) {
                 set.add(a[i]);
             }
         }
         for(int j=0;j<a.length;j++) {
             if(set.contains(target-a[j])) {
                 //System.out.println(a[j]);
                 //System.out.println(target-a[j]);
                 System.out.printf("(%d, %d)", a[j], target-a[j]);
             }
         }
     }
}
        
