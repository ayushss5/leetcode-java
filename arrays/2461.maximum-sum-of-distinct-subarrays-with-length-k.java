/*
 * @lc app=leetcode id=2461 lang=java
 *
 * [2461] Maximum Sum of Distinct Subarrays With Length K
 */

// @lc code=start
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set= new HashSet<>();
        long currentsum=0;
        long maxsum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size()==k){
                set.remove(nums[left]);
                currentsum-=nums[left];
                left++;
            }
            currentsum += nums[right];
            set.add(nums[right]);
            if(set.size()==k){
                maxsum = Math.max(currentsum,maxsum);
            }
        }
    return maxsum;
    }
}