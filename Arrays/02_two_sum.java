// ============================================
// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Topic: Arrays
// ============================================

// APPROACH: Brute Force
// Check every possible pair of elements in the array
// For each element at index i, check all elements after it (j = i+1)
// If nums[i] + nums[j] equals target, return their indices
// We start j from i+1 to avoid using the same element twice
//
// Time Complexity: O(n²) → nested loop checks every pair
// Space Complexity: O(1) → no extra space used
//
// Note: Optimal solution exists using HashMap in O(n)
//       but brute force is the best starting point to understand the problem
// ============================================

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Outer loop: pick first element one by one
        for (int i = 0; i < nums.length; i++) {

            // Inner loop: pick second element after i to avoid duplicates
            for (int j = i + 1; j < nums.length; j++) {

                // Check if current pair sums to target
                if (nums[i] + nums[j] == target) {

                    // Return indices of the two numbers that add up to target
                    return new int[]{i, j};
                }
            }
        }

        // Return empty array if no solution found (as per constraints, this won't happen)
        return new int[]{};
    }
}