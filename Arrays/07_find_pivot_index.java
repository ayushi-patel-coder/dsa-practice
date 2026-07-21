// ============================================
// Problem: Find Pivot Index
// Link: https://leetcode.com/problems/find-pivot-index/
// Difficulty: Easy
// Topic: Arrays
// ============================================

// APPROACH: Prefix Sum + Right Sum Calculation
// Step 1: Calculate total sum of entire array
// Step 2: Traverse array maintaining left_sum
//         right_sum = total_sum - left_sum - nums[i]
// Step 3: If left_sum == right_sum, current index is pivot
// Step 4: Update left_sum by adding current element
// Why this works: Avoids using extra array, O(1) space
//
// Time Complexity: O(n) → two passes through array
// Space Complexity: O(1) → only variables used
// ============================================

class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        // Step 1: Calculate total sum of array
        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum = total_sum + nums[i];
        }

        // Step 2: Traverse and find pivot index
        int left_sum = 0;
        for (int i = 0; i < n; i++) {

            // Right sum = total - left side - current element
            int right_sum = total_sum - left_sum - nums[i];

            // Pivot found when left sum equals right sum
            if (left_sum == right_sum) {
                return i;
            }

            // Update left sum by adding current element
            left_sum = left_sum + nums[i];
        }

        // No pivot index found
        return -1;
    }
}
