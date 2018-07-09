public class Test
{
	public static int Sqrt(int x)
	{
	    
	    int result = 0;
		// Base Cases
		if (x == 0 || x == 1)
			return x;

		
		int start = 1, end = x, ans=0;
		while (start <= end)
		{
			int mid = (start + end) / 2;
			result = mid * mid;

			
			if (result == x)
				return mid;

			
			if (result < x)
			{
				start = mid + 1;
				
			}
			else // If mid*mid is greater than x
				end = mid - 1;
		}
		return result;
	}

	// Driver Method
	public static void main(String args[])
	{
		int x = 36;
		System.out.println(floorSqrt(x));
	}
