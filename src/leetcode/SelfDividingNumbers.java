package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(selfDividingNumbers(1,22));
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
        if(right == 10000){
        	right = 9999;
        }
        for(int i = left;i<=right;i++){
        	if(check(i)){
        		l.add(i);
        	}
        }
        return l;
    }
	
	public static boolean check(int k){
		int first = k/1000;
		int second = (k-first*1000)/100;
		int third = (k-first*1000-second*100)/10;
		int forth = k-first*1000-second*100-third*10;
		if(first!=0&&second!=0&&third!=0&&forth!=0){
			if(k%first==0&&k%second==0&&k%third==0&&k%forth==0){
				return true;
			}
		}else if(first==0&&second!=0&&third!=0&&forth!=0){
			if(k%second==0&&k%third==0&&k%forth==0){
				return true;
			}
		}else if(first==0&&second==0&&third!=0&&forth!=0){
			if(k%third==0&&k%forth==0){
				return true;
			}
		}else if(first==0&&second==0&&third==0&&forth!=0){
			return true;
		}		
		return false;
	}

}
