package leetcode;

public class numberComplement {

	public static void main(String[] args) {
		int input = 4;
		
		
		System.out.print(findComplement(input));
	}
	
	 public static int findComplement(int num) {
		 int answer = 0;
		 System.out.println(num);
		 System.out.println(Integer.toBinaryString(num));
		 
		 int length=Integer.toBinaryString(num).length();

		 String str1 = Integer.toBinaryString(~num);
		 System.out.println(Integer.toBinaryString(~num));
		 System.out.println(length);


		 System.out.println(str1);
		 String str = str1.substring(31-length+1, 32);

		 System.out.println(str);
		 

		 for(int i = 1;i<length+1;i++){
			 if(str.charAt(i-1)=='1'){
				 answer =   (int) (answer+Math.pow(2,length-i));

			 }
		 }
	        return answer;
	    }

}
