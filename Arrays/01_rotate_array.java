package Arrays;
// ============================================
// Problem: Rotate Array
// Link: https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Topic: Arrays
// ============================================

// APPROACH: Reversal Algorithm
// Step 1: k = k % n → to avoid unnecessary rotations
//         (e.g. if array size 5 and k=7, actual rotations = 7%5 = 2)
// Step 2: Reverse entire array (0 to n-1)
// Step 3: Reverse first k elements (0 to k-1)
// Step 4: Reverse remaining elements (k to n-1)
// Why this works: Reversing rearranges elements
//                 to their correct rotated positions
//
// Time Complexity: O(n) → array traversed three times
// Space Complexity: O(1) → no extra array used, elements
//                          swapped directly in heap memory
// ============================================

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        // Step 1: Find actual rotations needed using modulo
        k = k % n;

        // Step 2: Reverse the entire array (0 to n-1)
        rotate(nums, 0, n - 1);

        // Step 3: Reverse first k elements (0 to k-1)
        rotate(nums, 0, k - 1);

        // Step 4: Reverse remaining elements (k to n-1)
        rotate(nums, k, n - 1);

        // Print the final rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Helper function: reverses array elements from index s to e
    // Changes are made directly in heap memory (pass by reference)
    public static void rotate(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];  // save start element in temp
            nums[s] = nums[e];   // place end element at start
            nums[e] = temp;      // place temp (original start) at end
            s++;                 // move start forward
            e--;                 // move end backward
        }
    }
}


