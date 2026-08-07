/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=1; i<=nums.length;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}

// @lc code=end

