class Solution {
    public int minOperations(int[] nums, int x) {

        int totalSum = 0;
        int n = nums.length;

        // Find total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Instead of removing x, keep totalSum - x
        int target = totalSum - x;

        if (target < 0) return -1;

        // Target 0 => remove entire array
        if (target == 0) return n;

        // Find longest subarray with sum = target
        int left = 0;
        int sum = 0;
        int longest = -1;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            // Shrink window if sum becomes too large
            while (sum > target) {
                sum -= nums[left++];
            }

            // Valid window found
            if (sum == target) {
                longest = Math.max(longest, right - left + 1);
            }
        }

        // Keep maximum => remove minimum
        return longest == -1 ? -1 : n - longest;
    }
}