class Solution {
    public int majorityElement(int[] nums) {

        int value = 0;
        int freq = 0;

        for (int num : nums) {

            if (freq == 0) {
                value = num;
            }

            if (num == value) {
                freq++;
            } else {
                freq--;
            }
        }

        return value;
    }
}