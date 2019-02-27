/*Program to even numbers on the left and odd numbers on the right. 
//Constraint : Left and Right side even and odd numbers should be in sorted order

Example : {10,8,7,6,5,24,55,98}
Output : {6,8,10,24,98,5,7,55}
*/


import java.util.*;
public class Test{

     public static void main(String []args){
        int arr[] = new int[] {10,8,7,6,5,24,55,98};
        //even left side and odd right side
        
        // [1,5,6,3]
        
        int i = 0;
        int j = arr.length-1;
        //int evenindex = 0;
        //int oddindex = 0;
        
        while(i <= j) {
            if(arr[i]%2==0 && arr[j]%2==0) i++;
            else if(arr[i]%2!=0 && arr[j]%2!=0) i++;
            else if(arr[i] %2==0 && arr[j]%2!=0) {
                i++;
                j--;
            }
            else if(arr[i]%2!=0 && arr[j]%2==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        for(int z=0;z<arr.length;z++) {
            if(arr[z]%2==0 && arr[z+1]%2!=0) {
             int evenindex = z;
               int oddindex = z+1;
               //System.out.println(evenindex);
               //System.out.println(oddindex);
               Arrays.sort(arr,0,evenindex+1);
               Arrays.sort(arr,oddindex,arr.length);
              
            }
           
        }
        for(int k=0;k<arr.length;k++) {
        System.out.print(arr[k]);
        System.out.print(" ");
     }
