class Solution
{

public int singlenumber(int nums[])
{

int result = 0;

for(int i=0;i<nums.length();i++)
{
result = result ^ nums[i];
}

return result;
}
}
