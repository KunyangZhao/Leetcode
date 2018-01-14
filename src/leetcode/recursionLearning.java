package leetcode;

import java.util.ArrayList;

public class recursionLearning {

	public static void main(String[] args) {
		String str = "12345678";
		// TODO Auto-generated method stub
//		System.out.println(str.substring(1));
		int answer = caculate(str);

		System.out.println("字符串 "+"'"+str+"'"+" 的长度:"+answer);
		
		int fac = 15;
		System.out.println(fac+"的阶乘为"+caculateFactor(fac));
		
		hanoi(2,"A","B","C");
		String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
		String[] arr1 = findWords(arr);
		for(int i = 0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		String s= "Dad";
		char k = s.charAt(0) ;
		System.out.println(transfer(s));
	}
	
	
	   
	
	
	//计算一个字符串的长度
	public static int caculate(String str){
		if(str == null||str.equals("")){
			return 0;
		}
		if(str.length()==1){
			return 1;
		}
		return 1+caculate(str.substring(1));
	}
	
	//一个正整数的阶乘（英语：factorial）是所有小于或等于该数的正整数的积，
	//并且0的阶乘为1。
	public static int caculateFactor(int i){
		if(i==0){
			return 1;		
		}
		if(i==1){
			return 1;
		}
		return i*caculateFactor(i-1);		
	}
	
	//汉诺塔
	public static void hanoi(int n, String from, String to, String other){
		if(n==1){
			System.out.println(from+"->"+to);
		}else{
			hanoi(n-1, from, other, to);
		    hanoi(1, from, to, other);
		    hanoi(n-1, other, to, from);
		}
	}
	
	public static String[] findWords(String[] words) {
        ArrayList<String> l = new ArrayList();
        for(int i = 0; i<words.length; i++){
            if(isSameLine(words[i])){
                l.add(words[i]);
            }
        }
        int arrayLength = l.size();
        String[] arr = new String[arrayLength];
        for(int i = 0; i<arrayLength; i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
    
    public static boolean isSameLine(String str){
        String newStr = transfer(str);
        for(int i = 1; i<newStr.length(); i++){
            if(newStr.charAt(0)!=newStr.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
    public static String transfer(String str){
        str = str.toLowerCase();
        String answer = "" ;
        for(int i = 0; i<str.length(); i++){
            char n = '4';
            switch(str.charAt(i)){
                    case 'a': n='2';
                    break;
                    case 's': n='2';
                    break;
                    case 'd': n='2';
                    break;
                    case 'f': n='2';
                    break;
                    case 'g': n='2';
                    break;
                    case 'h': n='2';
                    break;
                    case 'j': n='2';
                    break;
                    case 'k': n='2';
                    break;
                    case 'l': n='2';
                    break;
                    case 'z': n='3';
                    break;
                    case 'x': n='3';
                    break;
                    case 'c': n='3';
                    break;
                    case 'v': n='3';
                    break;
                    case 'b': n='3';
                    break;
                    case 'n': n='3';
                    break;
                    case 'm': n='3';
                    break;
                    case 'w': n='1';
                    break;
                    case 'q': n='1';
                    break;
                    case 'e': n='1';
                    break;
                    case 'r': n='1';
                    break;
                    case 't': n='1';
                    break;
                    case 'y': n='1';
                    break;
                    case 'u': n='1';
                    break;
                    case 'i': n='1';
                    break;
                    case 'o': n='1';
                    break;
                    case 'p': n='1';
                    break;

            }
            answer = n+answer;
        }
//        System.out.println(answer);

        return answer;
    }
	
}
