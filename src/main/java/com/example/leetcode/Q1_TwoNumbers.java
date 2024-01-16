package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1_TwoNumbers {
    public static int[] twoSum(int[] nums, int target) {
        var result = new int[2];
        var map = new HashMap<Integer, Integer>();
        for(int i= 0; i< nums.length ; i++){
            var complement = target - nums[i];
            if(map.containsKey(complement) ){
                result[0] = map.get(complement);
                result[1] = i;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
