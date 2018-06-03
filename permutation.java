import java.util.*;

public class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    HelloWorld h = new HelloWorld();
	    System.out.println(h.permutaion("god","dog"));
	    
	    
	}

	
	
	public boolean permutaion(String s1,String s2)
	{
	    int a1[] = new int[128];
	    int a2[] = new int[128];
	    
	    for(int i=0;i<s1.length()-1;i++)
	    {
	        a1[s1.charAt(i)-'0']++;
	    }
	    
	   for(int j=0;j<s2.length()-1;j++)
	    {
	       a2[s2.charAt(j)-'0']++;
	    }
	    
	    if(!Arrays.equals(a1,a2))
	    {
	        return false;
	    }
	    
	    return true;
	}
}
