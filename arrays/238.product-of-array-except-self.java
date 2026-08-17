/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct[]=new int[nums.length];
        int rightProduct[]=new int[nums.length];
        int answer[]=new int[nums.length];
        int p1=1;
        int p2=1;
        leftProduct[0]=1;
        rightProduct[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            p1 = nums[i-1]*p1;
            leftProduct[i]=p1;
        }
        for(int i=nums.length-2;i>=0;i--){
            p2= nums[i+1]*p2;
            rightProduct[i]=p2;
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=leftProduct[i]*rightProduct[i];
        }
        return answer;
        
    }
}
// @lc code=end

