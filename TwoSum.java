class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        
        int i=0, j= numbers.length-1;
        int res[] = new int[2];
        int index1=-1,index2=-1;
        
        while(i<j)
        {
            if(numbers[i] + numbers[j] < target)
                i++;
            
            else if(numbers[i] + numbers[j] > target)
                j--;
            
            else if(numbers[i] + numbers[j] == target)
            {
                index1 = i+1;
                index2 = j+1;
                break;
            }
                
                
                
        }
        
        res[0] = index1;
                res[1] = index2;
           
        return res;
        
            
        }
            
        
    }
