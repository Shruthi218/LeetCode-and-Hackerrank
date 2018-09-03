public class Duplicates{

     public static void main(String args[]) {
         int a[] = new int[] {1,1,7,7,8,8,9};
         int res = count_duplicates(a);
         System.out.println(res);
     }
     
     public static int count_duplicates(int a[]) {
         int carr[] = new int[100];
         int count = 0;
         for(int i=0;i<a.length;i++) {
             
             carr[a[i]]++;
             }
         
         
         
         for(int j=0;j<carr.length;j++) {
             if(carr[j]!= 1 && carr[j]!=0) {
                 count++;
             }
         }
         
         return count;
     }
}
