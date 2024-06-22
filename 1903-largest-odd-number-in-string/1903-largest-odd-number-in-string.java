class Solution {
    public String largestOddNumber(String num) {
        // tc O(n) scO(1)
        // Iterative Check: Starting from the end of the number, iterate backward. If an odd digit is encountered, return the substring from the beginning up to (and including) that odd digit, as this is the largest odd number possible.

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        return "";
    }
}