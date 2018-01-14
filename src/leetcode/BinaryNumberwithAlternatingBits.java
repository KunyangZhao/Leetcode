package leetcode;

public class BinaryNumberwithAlternatingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(hasAlternatingBits(10));
	}
	
	public static boolean hasAlternatingBits(int n) {
		String str = Integer.toBinaryString(n);
		int l = str.length();
		int[] arr = new int[l];
		for(int i = 0;i<l;i++){
			arr[i] = Integer.parseInt(str.charAt(i)+"");
		}
		
		for(int i = 0;i<l-1;i++){
			if(arr[i]+arr[i+1]!=1){
				return false;
			}
		}
		return true;
	}

}
