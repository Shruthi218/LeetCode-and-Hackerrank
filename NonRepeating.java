// Java program to find first non-repeating character

class GFG 
{
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];
	static int index;
	
	/* calculate count of characters 
	in the passed string */
	static void getCharCountArray(String str) 
	{
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
			
			
			for(int j=0;j<count.length;j++)
			{
			    if(count[j]==1)
			    {
			        index = j;
			        break;
			    }
			    
			}
	}
	
	
	
	

	// Driver method
	public static void main (String[] args)
	{
		String str = "geeksforgeeks";
		getCharCountArray(str);
		System.out.println(str.charAt(index));
		
		
	}
}
