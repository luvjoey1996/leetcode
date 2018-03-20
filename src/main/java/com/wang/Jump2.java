package com.wang;

public class Jump2 {

    public int jump2(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int jump=1;
        int max=nums[0];
        int i=0;
        while (max<nums.length-1){
            int temp=max;
            int j=i;
            for (;j<=temp;j++){
                if (nums[j]+j>max){
                    max=nums[j]+j;
                }
            }
            jump++;
            i=j;
        }
        return jump;

    }

}
