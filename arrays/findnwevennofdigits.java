class Solution {
    public int findNumbers(int[] nums) {
        int c2=0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int c1 = 0;
            while(num>0){
                num = num/10;
                c1++;
            }
            if(c1%2==0){
                c2++;
            }

        }
        return c2;


        
    }
}