class Solution {
    public boolean isHappy(int n) {
//Happy number will not repeat while doing this logic. If it repeats and presents in the set, then it means its not a happy number.
        Set<Integer> set = new HashSet<Integer>();
        while(!set.contains(n)) {
            set.add(n);
            n = square(n);
            if(n==1) return true;
            
        }
        return false;
    }
    
    public int square(int n) {
        int sum = 0;
        while(n>0) {
            int digit = n % 10;
            sum+= (digit * digit);
            n/=10;
        }
        return sum;
    }
}
