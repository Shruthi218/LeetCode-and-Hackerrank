public class HelloWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    HelloWorld hw = new HelloWorld();
	    boolean res = hw.Edit("shruthi","hruthi");
	    System.out.println(res);
	    
	}
	
	public boolean Edit(String s1,String s2)
	{
	    int res1=0;
	    int res2 = 0;
	    int res3 = 0;
	    
	    for(int i=0;i<s1.length();i++)
	    {
	        res1 = res1 ^ s1.charAt(i);
	        
	    }
	    
	    for(int j=0;j<s2.length();j++)
	    {
	        res2 = res2 ^ s2.charAt(j);
	        
	    }
	    
	    res3 = res1 ^ res2;
	    
	    if(res1==res2)
	    return true;
	    
	    for(int k=0;k<s1.length();k++)
	    {
	        if(res3==s1.charAt(k))
	        {
	        return true;
	        }
	        
	        
	    }
	    return false;
	}
}
