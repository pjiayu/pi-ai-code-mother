package com.ppp.piaicodemother;


import java.util.*;

/**
 * @author 皮皮皮
 * @date 2026-03-10 15:16
 */
public class test {
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};

        int target = 9;
    }


    /****
     * 15.两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i])){
                return new int[]{m.get(target-nums[i]),i};
            }else{
                m.put(nums[i],i);
            }
        }
        return new int[0];
    }

}
