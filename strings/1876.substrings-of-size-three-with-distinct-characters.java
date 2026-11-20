/*
 * @lc app=leetcode id=1876 lang=java
 *
 * [1876] Substrings of Size Three with Distinct Characters
 */

// @lc code=start
class Solution {
    public int countGoodSubstrings(String s) {
        int left=0;
        int ans=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right)) || set.size()==3){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if(set.size()==3){
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

