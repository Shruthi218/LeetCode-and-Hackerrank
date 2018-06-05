public void Largest_three(int a[])
{

int max1,max2,max3=0;
for(int i=0;i<a.length();i++)
{
if(a[i] > max1)
{
max3 = max2;
max2 = max1;
max1 = a[i]; 
}
else if(a[i] > max2)
{
max3 = max2; 
max2 = a[i];
}
else
{
max3 = a[i];
}
}
}
