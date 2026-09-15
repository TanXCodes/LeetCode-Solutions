class Solution {
    public int myAtoi(String s) {
        //Remove Leading Spaces
        int i = 0, n = s.length();
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        // Check Sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        // Convert Digits
        int res = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digits = s.charAt(i) - '0';

            // Check Overflow
            if (res > (Integer.MAX_VALUE - digits) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + digits;
            i++;
        }
        return res * sign;
    }
}