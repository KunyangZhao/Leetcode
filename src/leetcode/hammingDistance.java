package leetcode;

public class hammingDistance {	
	public static void main(String[] args){
		int answer = hammingDistance(100,3);
		System.out.println(answer);
	}

	 public static int hammingDistance(int x,int y) {
		int count = 0;
		char[] x1 = changeToArray(x);
		System.out.println(x1);
		char[] y1 = changeToArray(y);
		System.out.println(y1);
		for(int i = 0;i<32;i++){
			if(x1[i]!=y1[i]){
				count++;
			}
		}
		return count;		
	    }
	
    public static char[] changeToArray(int x) { 
        String k = Integer.toBinaryString(x);        
        char[] k2 = new char[k.length()];
        for(int i=0;i<k.length();i++){
        k2[i]=k.charAt(i);
        }
		char[] k3 = new char[32];		
		for(int i = 0;i<32;i++){
			k3[i]='0';
		}
        System.arraycopy(k2, 0, k3, 31-k2.length, k2.length);      
        return k3;
   }

}
