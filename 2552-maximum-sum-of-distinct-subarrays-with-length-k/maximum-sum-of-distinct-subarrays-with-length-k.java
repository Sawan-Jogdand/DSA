class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long windowSum = 0;
        long max_ans = 0;

        HashSet<Integer> set = new HashSet<>();

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            windowSum += nums[right];

            if (right - left + 1 == k) {

                max_ans = Math.max(max_ans, windowSum);

                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return max_ans;
    }
}