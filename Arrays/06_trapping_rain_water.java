// ============================================
// Problem: Trapping Rain Water
// Link: https://leetcode.com/problems/trapping-rain-water/
// Difficulty: Hard
// Topic: Arrays
// ============================================

// APPROACH: Prefix Max + Suffix Max Arrays
// Step 1: Build prefixmax array
//         pmax[i] = max height from left up to index i
// Step 2: Build suffixmax array
//         smax[i] = max height from right up to index i
// Step 3: For each index i (excluding boundaries):
//         lb = max height on left  (pmax[i-1])
//         rb = max height on right (smax[i+1])
//         water level = min(lb, rb) (bottleneck decides water level)
//         contribution = water level - height[i]
//         if contribution > 0, add to total amount
//
// Time Complexity: O(n) → three passes through array
// Space Complexity: O(n) → two extra arrays for prefix and suffix
// ============================================

class Solution {
    public int trap(int[] height) {

        // Get prefix and suffix max arrays
        int[] pmax = prefixmax(height);
        int[] smax = suffixmax(height);

        int amount = 0;
        int n = height.length;

        // Calculate water trapped at each index
        for (int i = 1; i < n - 1; i++) {

            // Max height on left side of current index
            int lb = pmax[i - 1];

            // Max height on right side of current index
            int rb = smax[i + 1];

            // Water level = minimum of left and right boundaries
            int fb = Math.min(lb, rb);

            // Water trapped = water level - current height
            int contri = fb - height[i];

            // Add only if positive (water can be trapped)
            if (contri > 0) {
                amount = amount + contri;
            }
        }
        return amount;
    }

    // Build prefix max array: pmax[i] = max height from index 0 to i
    public int[] prefixmax(int[] height) {
        int n = height.length;
        int[] pmax = new int[n];
        pmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(pmax[i - 1], height[i]);
        }
        return pmax;
    }

    // Build suffix max array: smax[i] = max height from index i to n-1
    public int[] suffixmax(int[] height) {
        int n = height.length;
        int[] smax = new int[n];
        smax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            smax[i] = Math.max(smax[i + 1], height[i]);
        }
        return smax;
    }
}