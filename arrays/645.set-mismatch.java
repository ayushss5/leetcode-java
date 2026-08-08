/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */
import java.util.HashSet;
// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = -1;
        for(int i:nums){
            if(set.contains(i)){      duplicate = i; 
            }
            set.add(i);
        }
        int missing =-1;
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                 missing = i;
            }
        }
        return new int[]{duplicate,missing};
        
    }
}
// @lc code=end

