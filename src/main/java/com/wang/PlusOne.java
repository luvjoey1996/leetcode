package com.wang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class PlusOne{
    public static int[] plusOne(int[] digits){
        int[] result = new int[digits.length+1];
        int temp=0;
        int z=1;
        for (int i=digits.length-1;i>=0;i--){
             temp = digits[i] + z;
             if (temp>=10){
                 result[i+1]=temp-10;
                 z=1;
             }else {
                 result[i+1]=temp;
                 z=0;
             }
        }
        if(temp>10){
            result[0] = 1;
        }else {
            result = Arrays.copyOfRange(result, 1, digits.length+1);
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
    }
}


//public class PlusOne {
//
//    public static int[] plusOne(int[] digits){
//        try {
//            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//            for (int i=0;i<10;i++){
//                map.put(i, 0);
//            }
//            for (int i=0;i<digits.length;i++){
//                map.put(digits[i],map.get(digits[i])+1);
//            }
//            int[] result = new int[digits.length];
//            int z=0;
//            for (int i=9;i>=0;i--){
//                int temp = map.get(i);
//                if (temp==0){
//                    continue;
//                }
//                for (int j=0;j<temp;j++){
//                    result[z]=i;
//                    z++;
//                }
//            }
//            return result;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return new int[] {};
//    }
//
//    public static void main(String[] args){
//        System.out.println(Arrays.toString(plusOne(new int[] {0})));
//    }
//
//}
