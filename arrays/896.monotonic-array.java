/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean monotonicinc=true;
        boolean monotonicdec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                monotonicinc=false;
            }
            if(nums[i]<nums[i+1]){
                monotonicdec=false;
            }
        }
        return monotonicinc || monotonicdec;
        
    }
}
// @lc code=end

