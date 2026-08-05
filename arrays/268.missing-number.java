/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];

        }
        int actualsum =n*(n+1)/2;
        int missing = actualsum - s;
        return missing;
        
    }
}
// @lc code=end

