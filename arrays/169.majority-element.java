/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            int f=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    f++;
                }
            }
            if(f>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
// @lc code=end

