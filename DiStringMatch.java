class Solution {
    public int[] diStringMatch(String S) {
        int size = S.length();
        int output_arr[] = new int[size+1];
        int low = 0;
        int high = size;
        for(int i=0;i < size; i++) {
            if(S.charAt(i)=='I') {
                output_arr[i] = low;
                low++;
            }
            else {
                output_arr[i] = high;
                high--;
            }
        }
        output_arr[size] = low;
        return output_arr;
    }
