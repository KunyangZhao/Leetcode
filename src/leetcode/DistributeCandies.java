package leetcode;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,3,6,3,2};
		System.out.println(distributeCandies(arr));
	}
	
	 public static int distributeCandies(int[] candies) {
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
	        for (int i = 0; i < candies.length; i++) {  
	            if (!map.containsKey(candies[i])) {  
	                map.put(candies[i], 1);  
	            } else {  
	                // 说明map中，存在该元素  
	                int num = map.get(candies[i]);  
	                map.put(candies[i], ++num);  
	            }  
	        }  
	        int l = 0;
	        for(Integer key : map.keySet()){  
	            System.out.println(key+"!");  
	            l++;
	        }  
	        int k = candies.length/2;
	        System.out.println("l="+l+":k="+k);
	        return l>k?k:l;
	    }

}
