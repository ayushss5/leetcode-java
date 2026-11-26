/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0;i<intervals.length;i++){
            if(res.isEmpty() || res.get(res.size() - 1)[1]<intervals[i][0]){
                res.add(intervals[i]);
            }
            else{
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1],intervals[i][1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
// @lc code=end

