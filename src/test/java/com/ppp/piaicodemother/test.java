package com.ppp.piaicodemother;


import java.util.*;

/**
 * @author 皮皮皮
 * @date 2026-03-10 15:16
 */
public class test {
    public static void main(String[] args) {
//        Set<String> hs = new HashSet<>();
//        hs.add("a");
//        hs.add("b");
//        for(String s:hs){
//            System.out.println(s);
//        }
//        System.out.println("------------------------------------------------");
//
//        List<Integer> list =  new LinkedList<>(Arrays.asList(4,6,2,8,1));
//        list.add(3);
//        list.removeLast();
//        list.getFirst();
//        list.addFirst(5);
//        System.out.println(list.get(2));
//        List<Integer> l = list.subList(0,2);
//
//        for(int i:l){
//            System.out.println(i);
//        }






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
