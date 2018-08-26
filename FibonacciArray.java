public class HelloWorld{

     public static void main(String []args){
        Fibonacci(10);
     }
     
     public static void Fibonacci(int numElement)
{
    int n = numElement - 1;
    int[] a = new int[numElement];
    a[0] = 0;
    a[1] = 1;
    for (int i = 2; i <= n; i++)
    {
        a[i] = a[i - 2] + a[i - 1];
    }
    //return a;
    
    for(int k=0;k<a.length;k++) {
        System.out.print(a[k]);
       System.out.print(" ");
    }
}
}
