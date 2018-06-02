public class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String s = new String("aaabaaa");
	    HelloWorld c = new HelloWorld();
	    String res = c.compression(s);
	    System.out.println(res);
	   
	    
	    
	    
	    
	
	}
	
	public String compression(String s)
	{
	     StringBuffer b = new StringBuffer();
	     
	     
	     int count = 1;
	     int j;
	     
	     
	    for(j=0;j<s.length()-1;j++)
	    {
	        
	        if(s.charAt(j)==s.charAt(j+1))
	        {
	        
	        count++;
	        
	        
	        
	        }
	        else
	        {
	           
	            b.append(s.charAt(j)).append(count);
	            count = 1;
	            
	            
	         
	        }
	        
	       
	       
	    
	    
	}
	
	return b.append(s.charAt(j)).append(count).toString();
	

	
}
}
