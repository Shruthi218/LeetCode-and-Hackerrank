public class HelloWorld{

     public static void main(String []args){
         int arr[] = new int[] {1,2,3,4,1,2,3,4};
        boolean result = array_half_equal(arr);
        System.out.println(result);
     }
     
     public static boolean array_half_equal(int arr[]) {
         //int start = 0;
         int end = arr.length-1;
         int mid = arr.length/2;
         
         int i=0;
         int j = mid;
         
         while(i < mid) {
             if(arr[i]==arr[j]) {
                 i++;
                 j++;
                 
             }
             
             
             else {
                 return false;
             }
             
         }
         return true;
     }
}
