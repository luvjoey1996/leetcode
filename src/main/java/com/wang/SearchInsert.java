package com.wang;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args){
        System.out.print(searchInsert(new int[] {1,3,5,6}, 5));
    }

}
