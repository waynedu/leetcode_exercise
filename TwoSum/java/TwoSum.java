package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    

    public int[] twoSum(int[] nums, int target) {
    	int[] output = new int[2]; 
    	Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	for (int i = 0 ; i < nums.length ; i++) {
    		if (map.containsKey(target - nums[i])) {
    			output[1] = i;
    			output[0] = map.get(target - nums[i])
				return output;
    		}
    		map.put(nums[i], i);
    	}
    	
    	
    	
		return output;
    	
    	
    	
//    	int index1 = 0;
//    	int index2 = 0;
//    	int output[] = { index1, index2 };
//    	
//        for (int i = 0; i <nums.length ; i++){
//        	int Iterate1 = nums[i];
//        	
//        	for (int j = 0; j <nums.length ; j++){
//        		int Iterate2 = nums[j];
//        		if (Iterate1 + Iterate2 == target) {
//        			
//        			index1 = i;
//        			index2 = j;
//        			return output;
//        			
//        		}
//        	}
//        }
//		return output;	
        
    }
}