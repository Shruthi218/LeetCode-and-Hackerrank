mport java.io.*;
import java.util.*;

class Solution {
  
  
    
  /*
    ? to the power n will be eual to x
    2 to the power 3 will be equal to 8
  */

  static double root(double x, int n) {
      // your code goes here
    
    double low = 1;
    double high = x-1;
    double mid = (low+high)/2;
    double result = Math.pow(mid,n);
    
    while(Math.abs(result-x) > 0.001) {
      
    
      System.out.println(mid);
    
    if(result > x) {
      high = mid;
    }
    
    else if(result <x) {
      low = mid;
    }
        mid = (low+high)/2;
    result = Math.pow(mid,n);
      
           
  }
    
    return mid;
  }
    
