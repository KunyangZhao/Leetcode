package leetcode;

public class CountBinarySubstrings {

	public static void main(String[] args) {
		String str = "111100001101000101110";
		// TODO Auto-generated method stub
//		System.out.println(TLEcountBinarySubstrings("1111000011010001011"));
		int ans = countBinarySubstrings1(str);
		System.out.println("");
		System.out.println(ans);

	}
	

	
	public static int countBinarySubstrings1(String s){
		int [] count = new int[s.length()];
        int tmp = 0;
        //将字符串转化为子串数组，其实下面这段代码可以改成i=1开始，到s.length()，这样就可以省去下面的判断语句
        for(int i=0; i<s.length()-1; i++){
            count[tmp] ++;
            if(s.charAt(i) != s.charAt(i+1))
                tmp ++;
        }
        count[tmp] ++;

        //对相邻元素箭的较小值进行求和
        for(int i=0; i<=tmp; i++){
        	System.out.print(count[i]);
        }
        
        int res = 0;
        //对相邻元素箭的较小值进行求和
        for(int i=0; i<=tmp; i++){
            res += Math.min(count[i], count[i+1]);
        }
        return res;
    }

	
	
	public static int TLEcountBinarySubstrings(String s) {
        int answer = 0;
        int l = s.length();
        for(int i = 1; i<l;i++){
        	for(int j = 0; j<l-i+1;j++){
    			System.out.println(s.substring(j, j+i));
        		if(check(s.substring(j, j+i))){
        			System.out.println(s.substring(j, j+i));
        			answer++;
        		}
        	}
        }
        if(check(s)){

			answer++;
		}
        return answer;
    }
	
	public static boolean check(String str){
		int l = str.length();
		if(l%2==1){
			return false;
		}
		char c = str.charAt(0);
		if(c=='1'){
			for(int i = 0; i<l/2;i++){
				if(str.charAt(i)!='1'){
					return false;
				}
			}for(int i = l/2; i<l;i++){
				if(str.charAt(i)!='0'){
					return false;
				}
			}
		}
		if(c=='0'){
			for(int i = 0; i<l/2;i++){
				if(str.charAt(i)!='0'){
					return false;
				}
			}for(int i = l/2; i<l;i++){
				if(str.charAt(i)!='1'){
					return false;
				}
			}
		}
		return true;
	}
}
