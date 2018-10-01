public class Solution {
public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuffer sb = new StringBuffer();
    
    // for numbers with more than 2 digits in it.
        while (i >= 0 || j >= 0) {
            int p = 0, q = 0;
            if (i >= 0) p = num1.charAt(i) - '0';
            if (j >= 0) q = num2.charAt(j) - '0';
            int sum = p + q + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
    
    // for cases with single digit , appending carry should be taken care of
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
