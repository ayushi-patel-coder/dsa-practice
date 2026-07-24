// ============================================
// Problem: Subarray Sum Equals K
// Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Difficulty: Medium
// Topic: Arrays
// ============================================

// APPROACH: Prefix Sum
// Build prefix sum array where psum[i] = sum from index 0 to i
// For each pair (a,b): if psum[b] - psum[a-1] == k → subarray found
// Count all such pairs
//
// Time Complexity: O(n²) → nested loop over prefix sum array
// Space Complexity: O(n) → prefix sum array
// ============================================

class Solution {
    public int subarraySum(int[] nums, int k) {

        int n = nums.length;

        // Build prefix sum array
        int[] psum = prefixsum(nums);

        int count = 0;

        // Check every subarray using prefix sum
        for (int a = 0; a < psum.length; a++) {
            for (int b = a; b < psum.length; b++) {

                int sum;

                // If a is 0, sum = psum[b] directly
                if (a == 0) {
                    sum = psum[b];
                } else {
                    // Sum of subarray from a to b
                    sum = psum[b] - psum[a - 1];
                }

                // If sum equals k, increment count
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // Build prefix sum array: psum[i] = sum of elements from 0 to i
    public int[] prefixsum(int[] nums) {
        int n = nums.length;
        int[] psum = new int[n];
        psum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            psum[i] = psum[i - 1] + nums[i];
        }
        return psum;
    }
}