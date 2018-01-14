package leetcode;

public class FindAnagramMappings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {12, 28, 46, 32, 50};
		int[] B	= {50, 12, 32, 46, 28};
		int[] ans = anagramMappings(A,B);
		for(int i = 0;i<ans.length;i++){
			System.out.print(ans[i]+",");
		}
	}
	
	public static int[] anagramMappings(int[] A, int[] B) {
		int[] ans = new int[A.length];
		for(int i = 0;i<A.length;i++){
			ans[i] = findPosition(A[i], B);
		}
		return ans;
	}
	
	public static int findPosition(int p, int[] arr){
		for(int i = 0; i<arr.length;i++){
			if(p==arr[i]){
				return i;
			}
		}
		return 0;
	}
	

}
