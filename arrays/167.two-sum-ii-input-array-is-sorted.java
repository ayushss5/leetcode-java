/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */
import java.util.*;
// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer>arr = new ArrayList<>();
        int left=0;
        int right=numbers.length-1;
        int res[] = new int[2];

        while(left<right){
            if(numbers[left]+numbers[right]==target){
                arr.add(left+1);
                arr.add(right+1);
                res[0] = arr.get(0);
                res[1] = arr.get(1);
                return res;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            right--;
        }
        return res;

        
    }
}
// @lc code=end

