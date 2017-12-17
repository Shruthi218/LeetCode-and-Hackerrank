class Solution 
{
    public int reverse(int x) 
    {
        int digit = 0;
        int result = 0;
        
        while(x > 0)
        {
            
            digit = x % 10;
            result = result * 10 + digit;
            x = x/10;
            
            
        }
        
        System.out.println(result);
        }
  }
