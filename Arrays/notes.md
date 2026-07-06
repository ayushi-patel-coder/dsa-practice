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