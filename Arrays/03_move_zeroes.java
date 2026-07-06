// ============================================
// Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Topic: Arrays
// ============================================

// APPROACH: Two Pointer
// Use variable 'l' as left pointer to track position for next non-zero element
// Traverse array with 'r' (right pointer)
// When non-zero element found, swap nums[r] with nums[l], then move l forward
// This moves all non-zero elements to front, zeroes shift to end automatically
//
// Time Complexity: O(n) → single pass through array
// Space Complexity: O(1) → no extra space, in-place swapping
// ============================================

class Solution {
    public void moveZeroes(int[] nums) {

        // Left pointer tracks position for next non-zero element
        int l = 0;

        // Right pointer traverses entire array
        for (int r = 0; r < nums.length; r++) {

            // If current element is non-zero, swap with left pointer position
            if (nums[r] != 0) {
                int temp = nums[l]; // save left element
                nums[l] = nums[r];  // place non-zero at left position
                nums[r] = temp;     // move zero to right position
                l++;                // move left pointer forward
            }
        }
    }
}