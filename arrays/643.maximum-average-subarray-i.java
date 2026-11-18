/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            maxSum=sum;
        }
        int left=0;
        int right=k;
        while(right<nums.length){
            sum-= nums[left];
            left++;
            sum+=nums[right];
            right++;
            maxSum = Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}
// @lc code=end

