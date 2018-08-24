public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int b[] = new int[] {1,1,1};
        int ans = non_zeroes(b);
        System.out.println(ans);
     }
     
     public static int non_zeroes(int a[]) {
         int i=0,j= a.length-1;
         while(i<=j) {
             if(a[i]!=0 && a[j]!=0) {
                 i++;
             }
             else if(a[i]==0 && a[j]!=0) {
                 int temp = a[j];
                 a[j] = a[i];
                 a[i] = temp;
                 i++;
                 j--;
             }
             else if(a[i]!=0 && a[j]==0) {
                i++;
             }
             else if(a[i]==0 && a[j]==0) {
                 j--;
             }
         }
         return i;
     }
}
