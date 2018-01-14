package leetcode;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Letcode";
		System.out.println(convertIntToAscii(122));

		System.out.println(detectCapitalUse(str));
	}
	
	public static char convertIntToAscii(int a) {
		return (a >= 0 && a <= 255) ? (char) a : '\0';
	}
	
	public static boolean detectCapitalUse(String word) {
       if(isC(word.charAt(0))){
    	   String newW = word.substring(1);
    	   if(allC(newW)||allL(newW)){
    		   return true;
    	   }
       }
       if(allC(word)){
    	   return true;
       }
       if(allL(word)){
    	   return true;
       }
       return false;
    }
	
	public static boolean allC(String str){
		int length = str.length();
		for(int i = 0; i<length;i++){
			if(!isC(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean allL(String str){
		int length = str.length();
		for(int i = 0; i<length;i++){
			if(!isL(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isC(char c){
		if(c>='A'&&c<='Z'){
			return true;
		}
		return false;
	}

	public static boolean isL(char c){
		if(c>='a'&&c<='z'){
			return true;
		}
		return false;
	}

}
