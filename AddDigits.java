/*
Some examples:

45 = 45 % 9 = 0, so answer would be 9 (4+5=9)
100 = 100 % 9 = 1 (100 = 1+0+0)
So trick is to divide the given number by 9, if completely divisibile then, 9 would be the answer.
Else whatever reminder value we get that will be the answer.

*/

class Solution {
    public int addDigits(int num) {
        if(num==0 || num <0) return 0;
        
        if(num%9==0) return 9;
        else return num%9;
    }
}
