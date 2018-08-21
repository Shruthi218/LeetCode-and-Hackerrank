public class HelloWorld{

     public static void main(String []args){
       int arr[] = new int[] {6,5,3,9,9,1,4};
       boolean res = cont_sum(arr,17);
       System.out.println(res);
     }
     
     
     public static boolean cont_sum(int arr[],int sum) {
         int l=0,r=0;
         int cur_sum = 0;
         while(l<arr.length-1 && r<arr.length-1) {
             if(cur_sum < sum) {
                 r++;
                 cur_sum = cur_sum + arr[r];
             }
             else if(cur_sum > sum) {
                 cur_sum = cur_sum - l;
                 l++;
             }
             else if(cur_sum==sum) {
                 return true;
             }
         }
         
         return false;
     }
}
