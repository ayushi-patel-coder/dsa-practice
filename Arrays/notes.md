# Arrays Notes 📝

---

## 01. Rotate Array
- Pattern: Reversal Algorithm
- Time: O(n), Space: O(1)
- Tip: Always do k = k % n first to avoid extra rotations
- Link: https://leetcode.com/problems/rotate-array/

---

## 02. Two Sum
- Pattern: Brute Force nested loop
- Time: O(n²), Space: O(1)
- Tip: Optimal approach → HashMap O(n)
       store complement (target - nums[i]) in map
- Link: https://leetcode.com/problems/two-sum/

---

## 03. Move Zeroes
- Pattern: Two Pointer
- Time: O(n), Space: O(1)
- Tip: Use left pointer to track next non-zero position
- Link: https://leetcode.com/problems/move-zeroes/

## 04. Remove Duplicates from Sorted Array
- Pattern: Two Pointer (slow + fast)
- Time: O(n), Space: O(1)
- Tip: Array is sorted so duplicates are always adjacent
- Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/


## 05. Product of Array Except Self
- Pattern: Prefix and Suffix Product
- Time: O(n), Space: O(1)
- Tip: ans[i] = prefix product * suffix product
- Division not allowed per constraint
- Link: https://leetcode.com/problems/product-of-array-except-self/


## 06. Trapping Rain Water
- Pattern: Prefix Max + Suffix Max
- Time: O(n), Space: O(n)
- Water at index i = min(leftMax, rightMax) - height[i]
- Only add if contribution > 0
- Link: https://leetcode.com/problems/trapping-rain-water/


## 07. Find Pivot Index
- Pattern: Prefix Sum
- Time: O(n), Space: O(1)
- right_sum = total_sum - left_sum - nums[i]
- If left_sum == right_sum → pivot found
- Link: https://leetcode.com/problems/find-pivot-index/


## 08. Maximum Subarray
- Pattern: Kadane's Algorithm
- Time: O(n), Space: O(1)
- If sum >= 0 → extend subarray
- If sum < 0 → reset sum to current element
- Initialize ans = Integer.MIN_VALUE for all-negative arrays
- Link: https://leetcode.com/problems/maximum-subarray/