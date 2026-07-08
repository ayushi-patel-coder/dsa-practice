// ============================================
// Problem: Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self/
// Difficulty: Medium
// Topic: Arrays
// ============================================

// APPROACH: Prefix and Suffix Product
// Step 1: Create answer array, fill with prefix products
//         ans[i] = product of all elements to the LEFT of i
// Step 2: Traverse from right, maintain suffix variable
//         multiply ans[i] with suffix (product of all elements to RIGHT of i)
// Why no division: constraint says division not allowed
//
// Time Complexity: O(n) → two passes through array
// Space Complexity: O(1) → only output array used, no extra space
// ============================================

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        // Output array to store final result
        int[] ans = new int[n];

        // Step 1: Fill prefix products
        // ans[0] = 1 (no elements to left of index 0)
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            // ans[i] = product of all elements before index i
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply suffix products from right side
        // suffix holds running product of elements to the right
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            // Multiply existing prefix product with suffix product
            ans[i] = ans[i] * suffix;
            // Update suffix with current element
            suffix = suffix * nums[i];
        }

        return ans;
    }
}
