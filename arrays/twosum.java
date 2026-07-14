public class twosum{
    public static void main(String[] args){
        int nums[] = {2,5,7,10};
    for(int i=0; i<nums.length;i++){
        for(int j=i+1; j<nums.length; j++){
            if (nums[i]+nums[j]==9) {
                System.out.println("the indexes are: " +i+ " and "+j);
                
            }
        }
    }

    }


}
    

