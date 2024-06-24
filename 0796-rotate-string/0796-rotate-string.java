class Solution {
    public boolean rotateString(String s, String goal) {
        //just checking whether goal (substr) present in s
        // tc O(nsquare) sc O(n)
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}