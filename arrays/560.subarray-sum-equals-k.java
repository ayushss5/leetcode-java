/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currentSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int needed = currentSum - k;
            if (map.containsKey(needed)) {
                count += map.get(needed);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}
// @lc code=end

