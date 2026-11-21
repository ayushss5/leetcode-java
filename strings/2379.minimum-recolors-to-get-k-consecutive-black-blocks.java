/*
 * @lc app=leetcode id=2379 lang=java
 *
 * [2379] Minimum Recolors to Get K Consecutive Black Blocks
 */

// @lc code=start
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int mincount=0;
        for(int i=0;i<k;i++) {
            if(blocks.charAt(i)=='W'){
                count++;
                mincount = count;
            }
        }
        int left=0;
        int right=k;
        while(right<blocks.length()){
            if(blocks.charAt(left)=='W'){count--;}
            left++;
            if(blocks.charAt(right)=='W'){
                count++;
            }
            right++;
            mincount = Math.min(count,mincount);
        }
        return mincount;
    }
}

// @lc code=end

