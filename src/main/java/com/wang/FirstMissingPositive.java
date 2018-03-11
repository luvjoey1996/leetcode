package com.wang;

import java.util.*;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums){
//        for (int i=0; i<nums.length;i++){
//            if (nums[i] > 0){
//                nums[i-1]=i;
//            }
//        }
//        for (int i=0;i<nums.length;i++){
//            if ()
//        }

        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i] ==1){
                int temp=2;
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j]==nums[j-1]){
                        continue;
                    } else if (!(temp==nums[j])){
                        return nums[j-1]+1;
                    }else {
                        temp++;
                    }
                }
                return nums[nums.length-1] + 1;
            }else if (nums[i]>1){
                return 1;
            }
        }
        return 1;
//        Set<Integer> set1 = new HashSet<Integer>();
//        Set<Integer> set2 = new HashSet<Integer>();
//        for(int i=0; i<nums.length;i++){
//            int temp = nums[i];
//            if (temp<=0){
//                set2.add(1);
//            }else if (temp==1){
//                set1.add(1);
//                set2.add(2);
//            }else if (temp>1){
//                set1.add(temp);
//                set2.add(temp-1);
//                set2.add(temp+1);
//            }
//        }
//
//        set2.removeAll(set1);
//        Object[] a = set2.toArray();
//        Arrays.sort(a);
//        return (Integer) a[0];
    }


    public static void main(String[] args){
        int a = firstMissingPositive(new int[] {-1,4,2,1,9,10});
        System.out.println(a);
    }


}
