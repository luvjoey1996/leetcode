package com.wang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new LinkedList<>());
        for (int i=0; i<nums.length;i++){
            int length = result.size();
            for (int j=0; j<length; j++){
                List<Integer> temp = new ArrayList<>(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
        // List<List<Integer>> result = new ArrayList<>();
        // result.add(new LinkedList<>());
        // for (int i=0; i<nums.length;i++){
        //     int length = result.size();
        //     for (int j=0; j<length; j++){
        //         List<Integer> temp = new LinkedList<>();
        //         temp.addAll(result.get(j));
        //         temp.add(nums[i]);
        //         result.add(temp);
        //     }
        // }
        // return result;
    }

}
