/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int start=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){

            }
            else{
                                if (start == i) {

                    answer.add(String.valueOf(nums[start]));

                } 

                else {

                    answer.add(nums[start] + "->" + nums[i]);

                }
                start=i+1;


            }

                
        }
        if (nums.length > 0) {
            if (start == nums.length - 1) {
                answer.add(String.valueOf(nums[start]));
                } 

            else{
                answer.add(nums[start] + "->" + nums[nums.length - 1]);
                }

        }

        return answer;
    }
}
// @lc code=end

