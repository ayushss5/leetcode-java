/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int maxLength=0;
        int left=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            length = right-left+1;
            if(length>maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
// @lc code=end

