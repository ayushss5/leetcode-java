/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */
import java.util.ArrayList;
import java.util.List;
// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            boolean found = false;
            for(int j=0; j<nums.length;j++){
                if(nums[j] == i){
                    found = true;
                }
            }
            if(!found){
                ans.add(i);
            }
        }
        return ans;
        
    }
}
// @lc code=end

