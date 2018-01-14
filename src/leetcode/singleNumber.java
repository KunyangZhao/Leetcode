package leetcode;

import java.util.ArrayList;
import java.util.List;

public class singleNumber {
	public static void main(String[] args) {
	
		int[] arr = {-1,-1,2};
		
		System.out.print("\n"+singleNumber(arr));
	}

	
	
	public static int singleNumber(int[] nums) {
		for(int i = 0;i<nums.length;i=i+2){			
			for(int j = i+1;j<nums.length;j++){
				if(nums[i]==nums[j]){
					int temp = nums[j];
					nums[j]=nums[i+1];
					nums[i+1]=temp;
					continue;
				}
			}
		}		
		if(nums.length>1){		
			for(int i = 0;i<nums.length-1;i=i+2){
				if((nums[i]^nums[i+1])!=0){
					return nums[i];
				}
            }
            return nums[nums.length-1];
		}else{
			return nums[0];
		}
	}

}
