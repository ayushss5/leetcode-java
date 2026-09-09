/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int area1 =1;
        int maxarea= Integer.MIN_VALUE;
        while(left<right){
            area1 = Math.min(height[left],height[right]) * (right-left);
            if(height[right]<height[left]){
                right--;
            }
            else if(height[right]>height[left]){
                left++;
            }
            else{
                left++;
            }
            if(area1>maxarea){
                maxarea=area1;
            }
        }
        return maxarea;
        
    }
}
// @lc code=end

