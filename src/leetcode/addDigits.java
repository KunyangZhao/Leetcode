package leetcode;

public class addDigits {
	public static void main(String[] args){
		int a = 9928;
		System.out.println(addDigits(a));
	}
	
	public static int addDigits(int num) {
        int sum=0;
        while(num>0){
        	
            sum = sum+num%10;
            num = num/10;
        }
        System.out.println(sum);
        if(sum<10){
            return sum;
        }else{
            return addDigits(sum);
        }
    }

}
