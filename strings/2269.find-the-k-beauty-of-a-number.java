/*
 * @lc app=leetcode id=2269 lang=java
 *
 * [2269] Find the K-Beauty of a Number
 */

// @lc code=start
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count=0;
        for(int i=0;i<=s.length()-k;i++){
           int part = Integer.parseInt(s.substring(i,i+k));
            if(part!=0){
                if(num % part==0){
                    count++;
            }
            }
        }
        return count;
    }
}
// @lc code=end

