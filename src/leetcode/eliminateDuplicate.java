package leetcode;

import java.util.ArrayList;

public class eliminateDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,3,6,3,2};
		System.out.println(op(arr));
	}
	
	public static ArrayList op(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		int l = arr.length;
		boolean[] arrFlag = new boolean[l];
		for(int k = 0;k<l;k++){
			arrFlag[k] = false;
		}
		for(int i = 0;i<l;i++){
			for (int j = i+1;j<l;j++){
				if (arr[i]==arr[j]){
					arrFlag[j] = true;					
				}
			}
		}
		
		for(int h = 0;h<l;h++){
			System.out.println(arr[h]+":"+arrFlag[h]);
			if(!arrFlag[h]){
				list.add(arr[h]);
			}
		}
		
		return list;
		
	}

}
