package com.xkd;

import java.util.LinkedList;
import java.util.List;

/**
 * Create by @author: wanghuijiu; @date: 18-3-21;
 */
public class Permute {

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length==0){
          return new LinkedList<>();
        } else if (nums.length==1){
            result.add(new LinkedList<Integer>(){{this.add(nums[0]);}});
            return result;
        }else {
            for (int i =0; i<nums.length; i++){
                int num = nums[i];
                int[] x = remove(nums, i);
                for (List<Integer> single:permute(x)){
                    single.add(num);
                    result.add(single);
                }
            }
        }
        return result;
    }


    private int[] remove(int[] nums, int index){
        int length = nums.length;
        int[] result = new int[length-1];
        if (index>=0 && index<length){
            System.arraycopy(nums, 0, result, 0, index);
            if(index < length - 1) {
                System.arraycopy(nums, index +1, result, index, length - index - 1);
            }
        }
        return result;
    }


    public static void main(String[] args){
        int[] x = new int[] {1,2,3};
        Permute solution = new Permute();
        System.out.println(solution.permute(x));
    }
}
