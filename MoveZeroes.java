/* Java program to push zeroes to back of array */
import java.io.*;

class PushZero
{
	// Function which pushes all zeros to end of an array.
	static void pushZerosToEnd(int arr[], int n)
	{
		int temp;
		int i = 0;

		int j = arr.length-1;
	       while(i<j)
	       {
	
			if (arr[i] == 0)
			{
				i++;
				
			}
			else if(arr[j]==0)
			{
			    j--;
			}
			
			
			
			
			else
			{
			    temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			    i++;
			    j--;
			}
				

		
	}
	}

	/*Driver function to check for above functions*/
	public static void main (String[] args)
	{
		int arr[] = {10,9,0,8,7,0,5,6,0};
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}
