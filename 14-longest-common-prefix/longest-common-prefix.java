class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char value = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != value) {
                    return result;
                }
            }

            result = result + value;
        }

        return result;
    }
}