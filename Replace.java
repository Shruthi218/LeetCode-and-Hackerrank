/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	  Codechef c1 = new Codechef();
	  System.out.println(c1.Replace());
	  
		
		
	}
	
	
	public String Replace()
	{
		String s = "Shruthi is trying to Study";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)!=' ')
		    {
		        sb.append(s.charAt(i));
		    }
		    else
		    {
		        sb.append("%20");
		    }
		    
		}
		
		return sb.toString();
		
	}
}
