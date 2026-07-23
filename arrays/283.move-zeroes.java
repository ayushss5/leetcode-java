/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
        if(nums[i] != 0){
            nums[k] = nums[i];
            k++;

        }
        }
        for(;k<nums.length;k++){
            nums[k] = 0;
        }
        
    }
}
// @lc code=end

