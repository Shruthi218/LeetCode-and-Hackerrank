class Solution {
    public int[] sortArrayByParity(int[] A) {
        
       int i = 0, j = A.length-1;
        while(i<j) {
            
            // odd and even case
            if(A[i]%2==1 && A[j]%2==0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
            // even and even case
            else if(A[i]%2==0 && A[j]%2==0) {
                i++;
                
            }
            
            // odd and even case
            else if(A[i]%2==1 && A[j]%2==1) {
                j--;
            }
            
            //even and odd case
            else if(A[i]%2==0 && A[j]%2==1) {
                i++;
            }
        }
          return A;  
        }
    }



