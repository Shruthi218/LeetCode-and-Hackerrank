import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int a[] = new int[] {4,8,30,10};
         topTwoMax(a);
     }
     
     
     public static void topTwoMax(int a[]) {
         int i = 0;
         int sum = 0;
        List<Integer> al = new ArrayList<Integer>();
        while(i< a.length && i+1<a.length) {
            sum = a[i] + a[i+1];
            al.add(sum);
            i++;
        }
            
            
        
    for(int k=0;k<al.size();k++) {
     //System.out.print(al.get(k));
     //System.out.print(" ");
     }
     
     
         int max1 = al.get(0);
         int max2 = al.get(1);
         int temp = 0;
         
         for(int m=2;m<al.size();m++) {
             if(al.get(m) > max1) {
                 temp = max1;
                 max1 = al.get(m);
                 
             }
             if(max2<temp) {
                 max2 = temp;
             }
             
         }
         System.out.print(max1 +" ");
         System.out.print(max2);
         
         
        
     }
}
             
