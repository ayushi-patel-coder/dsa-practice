// ============================================
// Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Topic: Arrays
// ============================================

// APPROACH: Two Pointer
// Use 'i' as slow pointer to track position for next unique element
// Use 'j' as fast pointer to traverse entire array
// Since array is sorted, duplicates are always adjacent
// When nums[j] != nums[i], a new unique element is found
// Place it at nums[i+1] and increment i
//
// Time Complexity: O(n) → single pass through array
// Space Complexity: O(1) → in-place, no extra space used
// ============================================

class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        // Slow pointer: tracks last unique element position
        int i = 0;

        // Fast pointer: scans entire array for unique elements
        for (int j = 1; j < n; j++) {

            // New unique element found
            if (nums[j] != nums[i]) {

                // Place unique element right after last unique position
                nums[i + 1] = nums[j];

                // Move slow pointer forward
                i++;
            }
        }

        // Return count of unique elements
        return (i + 1);
    }
}
