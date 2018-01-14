package leetcode;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{0,1,7,0,2,3};
		moveZeroes(nums);
		for(int i =0;i<nums.length;i++){
			System.out.print(nums[i]+",");
		}
	}

	public static void moveZeroes(int[] nums) {
        int l = nums.length;
        
        for(int i = 0,j = 0; i < l ; i++){
        	if(nums[i]!=0){  
        		if(i!=j){
        			nums[j] = nums[i];
        			nums[i] = 0;
        		}
            	j++;
        	}
        }
    }
	
}
