package com.wang;

public class Jump {

    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==0){
                if (max<=i){
                    return false;
                }
            }else {
                if (nums[i]+i>max){
                    max=nums[i]+i;
                }

            }
        }
        return true;
    }

}
