package leetcode;

public class lslandPerimeter {

	public static void main(String[] args) {
		int[][] input = {{1,1,0}};
		
		System.out.println(islandPerimeter(input));
		
		
	}
	
	    public static int islandPerimeter(int[][] grid) {
	    	int num=0;
	        int[][] g = new int[grid.length+2][grid[0].length+2];
	        for(int a = 0;a<g.length;a++){
	            for(int b=0;b<g[0].length;b++){
	                g[a][b]=0;
	            }
	        }
	        

	     
	       
	        
	        for(int c=1;c<g.length-1;c++){
	            for(int d=1;d<g[c].length-1;d++){
	                g[c][d]=grid[c-1][d-1];
	            }
	        }
	        
	        for(int i=0;i<g.length;i++){
	        	for(int j=0;j<g[0].length;j++){
	        	System.out.print(g[i][j]);
	        	}
	        	System.out.print("\n");
	        }
	        int a = 0,b=0,c=0,d =0;
	        System.out.println(g.length-1);

	        
	        for(int i = 1;i<g.length-1;i++){
	            for(int j = 1;j<g[0].length-1;j++){
	                if(g[i][j]==1&g[i][j-1]+g[i-1][j]+g[i+1][j]+g[i][j+1]==0){
	                    num=num+4;
	        	        System.out.println("location＝"+i+"  "+j);
	                    a++;
	                }else if(g[i][j]==1&g[i][j-1]+g[i-1][j]+g[i+1][j]+g[i][j+1]==1){
	                    num=num+3;
	                    b++;
	                }else if(g[i][j]==1&g[i][j-1]+g[i-1][j]+g[i+1][j]+g[i][j+1]==2){
	                    num=num+2;
	                    c++;
	                }else if(g[i][j]==1&g[i][j-1]+g[i-1][j]+g[i+1][j]+g[i][j+1]==3){
	                    num=num+1;
	                    d++;
	                }
	            }
	        }
	        
	        System.out.println("none＝"+a+" 1＝"+b+" 2="+c+" 3="+d);
	        return num;
	    }
}


