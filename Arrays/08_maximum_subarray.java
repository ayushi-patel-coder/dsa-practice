// ============================================
// Problem: Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Topic: Arrays
// ============================================

// APPROACH: Kadane's Algorithm
// Maintain a running sum, reset it when it becomes negative
// At each index, decide: should we extend current subarray or start fresh?
// If sum > 0 → extend by adding nums[i]
// If sum <= 0 → start fresh from nums[i] (negative sum only hurts us)
// Track maximum sum seen so far in ans
//
// Time Complexity: O(n) → single pass through array
// Space Complexity: O(1) → only variables used
// ============================================

class Solution {
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;

        // Initialize ans with smallest possible value
        // handles case where all numbers are negative
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (sum >= 0) {
                // Current sum is positive, extend subarray
                sum = sum + nums[i];
            } else {
                // Current sum is negative, start fresh from here
                sum = nums[i];
            }

            // Update maximum sum found so far
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}