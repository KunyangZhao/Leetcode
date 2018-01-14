package leetcode;

public class MaxAreaofIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {{0,0,1,0,1},{1,0,1,0,0},{1,0,1,1,0}};
		System.out.println(maxAreaOfIsland(input));
	}
	
	public static int maxAreaOfIsland(int[][] grid) {
		int l = grid.length;
		int w = grid[0].length;
		int answer = 0;
		for(int a = 0;a<l;a++){
            for(int b=0;b<w;b++){
                int tem = dfs(grid,a,b);
                answer = answer>=tem?answer:tem;
            }
        }
		return answer;
	}
		
	public static int dfs(int[][] grid, int i, int j){
		if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0){
			return 0;
		}
		int ans = 1;
		grid[i][j] = 0;
		ans = ans+dfs(grid,i-1,j)+dfs(grid,i,j-1)+dfs(grid,i+1,j)+dfs(grid,i,j+1);
		return ans;
		
		 // if i or j is invalid or grid is 0, just return 0
//		         if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
//		             return 0;
//		         
//		         // do dfs to its 4 direction cell when value is 1
//		         int tempMaxArea = 1;    
//		         grid[i][j] = 0; // set current cell to 0 to prevent dfs coming back
//		         
//		         // order is left, top, right, bottom
//		         tempMaxArea += dfs(grid, i, j-1) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i+1, j);
//		         
//	         return tempMaxArea;
	}
		
    

}
