/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        leftMax[0] = height[0];
        rightMax[rightMax.length-1]=height[rightMax.length-1];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            water += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return water;

        
    }
}
// @lc code=end

