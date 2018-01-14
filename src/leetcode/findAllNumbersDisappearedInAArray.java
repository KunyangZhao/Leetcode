package leetcode;

import java.util.ArrayList;
import java.util.List;

public class findAllNumbersDisappearedInAArray {
	
	public static void main(String[] args) {
		int[] input = {4,3,2,7,8,2,3,1};
		List<Integer> answer = new ArrayList<Integer>();
		answer = findDisappearedNumbers(input);		
		System.out.print(answer);		
	}
	
	 public static List<Integer> findDisappearedNumbers1(int[] nums) {
	        List<Integer> l = new ArrayList<Integer>();
	        int[] flags = new int[nums.length];
	        for(int i = 0;i<flags.length;i++){
	        	flags[i]=0;
	        }	        
	        for(int i = 1;i<nums.length+1;i++){
	        	for(int j = 0;j<nums.length;j++){
	        		if(nums[j]==i){
	        			flags[i-1]=1;
	        			break;	        			
	        		}
	        	}	        
	        }	        
	        for(int i=0;i<nums.length;i++){
	        	if(flags[i]==0){
	        		l.add(i+1);
	        	}
	        }	        
	        return l;	        
	    }
	 
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> l = new ArrayList<Integer>();
	        
	        for(int i = 0;i<nums.length;i++){
	        	while(nums[i]!=i+1&&nums[nums[i]-1]!=nums[i]){
	        		int a = nums[nums[i]-1];
	        		nums[nums[i]-1] = nums[i];
	        		nums[i] = a;
	        	}
	        }
	        
//	        for(int i=0;i<nums.length;i++){
//	        	System.out.print(nums[i]+" ");
//	        }
	        
	        for(int i =0;i<nums.length;i++){
	        	if(nums[i]!=i+1){
	        		l.add(i+1);
	        	}
	        }
	        
	        return l;	        
	    }

}
