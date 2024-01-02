class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        String[] mapping = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        letterCombinationRecursive(res, digits, "", 0, mapping);
        return res;
    }

    public void letterCombinationRecursive(List<String> res, String digits, String current, int index, String[] mapping) {
        if (index == digits.length()) {
            res.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            letterCombinationRecursive(res, digits, current + letters.charAt(i), index + 1, mapping);
        }
    }
}
