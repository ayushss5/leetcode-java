/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                answer[position] = nums[left] * nums[left];
                left++;
            } 
            else {
                answer[position] = nums[right] * nums[right];
                right--;
            }
            position--;
        }
        return answer;
    }
}
// @lc code=end

