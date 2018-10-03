class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int mynum = reverse(x);
        return mynum==x;
        
    }
    
    public int reverse(int num) {
        int digit = 0;
        int result = 0;
        while(num>0) {
            digit = num % 10;
            result = result * 10 + digit;
            num = num /10;
        }
        return result;
    }
}




